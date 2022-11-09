// Link : https://www.codechef.com/submit/BESTOFTWO

package practice;

import java.util.*;
public class BestOfTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			int best = 0;
			if (x == y) {
				best = x;
			} else {
				if (x > y) {
					best = x;
				} else {
					best = y;
				}
			}
			System.out.println(best);
		}
	}
}
