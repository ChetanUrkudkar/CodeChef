// https://www.codechef.com/submit/INTRDSGN

package practice;

import java.util.*;
public class InteriorDesign {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			
			int sum1 = x1 + y1;
			int sum2 = x2 + y2;
			
			if (sum1 > sum2) {
				System.out.println(sum2);
			} else {
				System.out.println(sum1);
			}
		}
	}
}
