// Link : https://www.codechef.com/submit/TASTEDEC

package practice;

import java.util.*;
public class TastyDecisions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			int pacX = x * 2;
			int pacY = y * 5;
			
			if (pacX > pacY) {
				System.out.println("Chocolate");
			} else if (pacX < pacY) {
				System.out.println("Candy");
			} else {
				System.out.println("Either");
			}
		}
	}
}
