// Link : https://www.codechef.com/submit/SIXFRIENDS

package practice;

import java.util.*;
public class SixFriends {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while(t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			int dr = (x*6)/2;
			int tr = (y*6)/3;
			
			if (dr > tr) {
				System.out.println(tr);
			} else {
				System.out.println(dr);
			}
		}
	}
}
