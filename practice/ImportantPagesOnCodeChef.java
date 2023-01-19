// Link : https://www.codechef.com/problems/CHEFPAGES

package practice;

import java.util.*;
public class ImportantPagesOnCodeChef {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if (a == 0 && b == 1) {
			System.out.println("https://www.codechef.com/practice");
		} else if (a == 1 && b == 0) {
			System.out.println("https://www.codechef.com/contests");
		} else if (a == 1 && b == 1) {
			System.out.println("https://discuss.codechef.com");
		} else {
		    System.out.println("https://www.codechef.com/practice");
		}
	}
}
