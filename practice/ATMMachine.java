// Link : https://www.codechef.com/problems/ATM2

package practice;

import java.util.*;
public class ATMMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int a = input.nextInt();
			
			int[] arr = new int[n];
			
			String end = "";
			
			for (int i=0; i<n; i++) {
				arr[i] = input.nextInt();
				if (arr[i] <= a) {
					end = end + String.valueOf(1);
					a = a - arr[i];
				} else {
					end = end + String.valueOf(0); 
				}
			}
			System.out.println(end);
		}
	}
}
