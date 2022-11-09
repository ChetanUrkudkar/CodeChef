// Link : https://www.codechef.com/submit/TALLER

package practice;

import java.util.*;
public class WhoIsTaller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (x < y) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}
		}
	}
}
