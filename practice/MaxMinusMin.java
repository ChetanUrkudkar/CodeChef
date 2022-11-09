// Link : https://www.codechef.com/submit/MAXDIFFMIN

package practice;

import java.util.*;
public class MaxMinusMin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		while (t --> 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			int max, min = 0;
			
			if (a > b && a > c) {
				max = a;
			} else if (b > a && b > c) {
				max = b;
			} else {
				max = c;
			}
			
			if (a < b && a < c) {
				min = a;
			} else if (b < a && b < c) {
				min = b;
			} else {
				min = c;
			}
			
			System.out.println(max - min);
		}
	}
}	
