// Link : https://www.codechef.com/problems/CS2023_STK

package practice;

import java.util.*;
public class CodeChefStreak {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			
			int maxo = 0;
			int maxa = 0;
			
			int count = 0;
			
			for (int i=0; i<n; i++) {
				int temp = input.nextInt();
				
				if (temp != 0) {
					count++;
					maxo = Integer.max(count, maxo);
				} else {
					count = 0;
				}
			}
			
			count = 0;
					
			for (int i=0; i<n; i++) {				
				int temp = input.nextInt();
				
				if (temp != 0) {
					count++;
					maxa = Integer.max(count, maxa);
				} else {
					count = 0;
				}
			}
			
			if (maxa > maxo) {
				System.out.println("Addy");
			} else if (maxa < maxo) {
				System.out.println("Om");
			} else {
				System.out.println("Draw");
			}
		}
	}
}
