// Link : https://www.codechef.com/problems/SELFDEF

package practice;

import java.util.*;
public class SelfDefenceTraining {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t -->0) {
			int n = input.nextInt();
			
			int[] arr = new int[n];
			
			int count = 0;
			for (int i=0; i<n; i++) {
				arr[i] = input.nextInt();
				if (10 <= arr[i] && arr[i] <= 60) {
					count += 1;
				}
			}
			
			System.out.println(count);
		}
	}
}
