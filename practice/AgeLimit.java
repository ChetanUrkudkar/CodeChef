// Link : https://www.codechef.com/submit/AGELIMIT

package practice;

import java.util.*;
public class AgeLimit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int mini = input.nextInt();
			int maxi = input.nextInt();
			int age = input.nextInt();
			
			if (age >= mini) {
				if (maxi > age) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}
	}
}
