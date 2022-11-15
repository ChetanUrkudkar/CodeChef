// Link : https://www.codechef.com/problems/DISTINCTCOL

package practice;

import java.util.*;
public class DistinctColors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int[] a = new int[n];
			for (int i=0; i<n; i++) {
				a[i] = input.nextInt();
			}
			
			int max = a[0];
			for (int i=0; i<n; i++) {
				if (a[i] > max) {
					max = a[i];
				}
			}
			
			System.out.println(max);
		}
	}
}
