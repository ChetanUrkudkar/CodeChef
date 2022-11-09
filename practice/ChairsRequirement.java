// Link : https://www.codechef.com/submit/CHAIRS_

package practice;

import java.util.*;
public class ChairsRequirement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			int buy = 0;
			if (x == y) {
				buy = 0;
			} else {
				if (x < y) {
					buy = 0;
				} else {
					buy = x - y;
				}
			}
			System.out.println(buy);
		}
	}
}
