// Link : https://www.codechef.com/problems/DOLL

package practice;

import java.util.*;
public class RedLightGreenLight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while(t --> 0) {
			int n = input.nextInt();
			int k = input.nextInt();
			
			int[] arr = new int[n];
			
			int count = 0;
			for (int i=0; i<n; i++) {
				int temp = input.nextInt();
				
				if(temp > k) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}
