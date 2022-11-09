// Link : https://www.codechef.com/submit/PRIZEPOOL

package practice;

import java.util.*;
public class TotalPrizeMoney {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			int top = x * 10;
			int last = y * 90;
			int total = top + last;
			
			System.out.println(total);
		}
	}
}
