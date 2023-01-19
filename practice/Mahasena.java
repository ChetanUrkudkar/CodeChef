// Link : https://www.codechef.com/problems/AMR15A

package practice;

import java.util.*;
public class Mahasena {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] a = new int[n];
		
		int oc = 0;
		int ec = 0;
		
		for (int i=0; i<n; i++) {
			a[i] = input.nextInt();
			if (a[i] % 2 == 0) {
				ec += 1;
			} else {
				oc += 1;
			}
		}
		
		if (oc >= ec) {
			System.out.println("NOT READY");
		} else {
			System.out.println("READY FOR BATTLE");
		}
	}
}
