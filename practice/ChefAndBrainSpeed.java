// Link : https://www.codechef.com/submit/CBSPEED

package practice;

import java.util.*;
public class ChefAndBrainSpeed {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x == y) {
			System.out.println("NO");
		} else {
			if (x < y) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
