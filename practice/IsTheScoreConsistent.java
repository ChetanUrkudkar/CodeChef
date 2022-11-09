// Link : https://www.codechef.com/submit/TRUESCORE

package practice;

import java.util.*;
public class IsTheScoreConsistent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int a1 = input.nextInt();
			int b1 = input.nextInt();
			
			int a2 = input.nextInt();
			int b2 = input.nextInt();
			
			if (a1 <= a2 && b1 <= b2) {
				System.out.println("POSSIBLE");
			} else {
				System.out.println("IMPOSSIBLE");
			}
		}
	}
}
