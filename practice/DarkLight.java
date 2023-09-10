// Link : https://www.codechef.com/problems/DARLIG

package practice;

import java.util.*;
public class DarkLight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int k = input.nextInt();
			
			if (n % 4 == 0) {
				System.out.println(check(k));
			} else if (n == 0) {
				System.out.println(check(k));
			} else {
				if (k == 0) {
					System.out.println("On");
				} else {
					System.out.println("Ambiguous");
				}
			}
		}
	}
	
	private static String check(int k) {
		// TODO Auto-generated method stub
		if (k == 1) {
			return "On";
		} else {
			return "Off";
		}
	}
}
