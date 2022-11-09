// Link : https://www.codechef.com/submit/CHEFCAND

package practice;

import java.util.*;
public class ChefAndCandies {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int children = input.nextInt();
			int candy = input.nextInt();
			
			int newCandy = 0;
			if (children <= candy) {
				System.out.println(0);
			} else {
				int diff = children - candy;
				for (int j=diff; j<=diff+5; j++) {
					if (j % 4 == 0) {
						newCandy = j;
						break;
					}
				}
				int packets = newCandy / 4;
				System.out.println(packets);
			}
		}
	}
}