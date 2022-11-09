// Link : https://www.codechef.com/submit/CHEFONDATE

package practice;

import java.util.*;
public class ChefOnDate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (x == y) {
				System.out.println("YES");
			} else {
				if (x > y) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
