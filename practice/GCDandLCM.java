// Link : https://www.codechef.com/problems/FLOW016

package practice;

import java.util.*;
public class GCDandLCM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			long a = input.nextLong();
			long b = input.nextLong();
			
//			int gcd = 0;
//			for (int i=Math.min(a, b); i>=1; i--) {
//				if (a % i == 0 && b % i ==0) {
//					gcd = i;
//					break;
//				}
//			}
			
			long n1 = a;
			long n2 = b;
			
			while (n2 != 0) {
				long temp = n1 % n2;
				n1 = n2;
				n2 = temp;
			}
			
			long lcm = Math.abs(a * b) / n1;
			
			System.out.println(n1 + " " + lcm);
		}
	}
}