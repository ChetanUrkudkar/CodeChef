// Link : https://www.codechef.com/problems/MISSP

package practice;

import java.util.*;
public class ChefAndDolls {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int j=0; j<t; j++) {
			int n = input.nextInt();
			
			int[] arr = new int[n+1];
			for (int i=0; i<n; i++) {
				arr[i] = input.nextInt();
			}
			
			Arrays.sort(arr, 0, n);
			
			for (int i=0; i<=n; i+=2) {
				if (arr[i] != arr[i+1]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
