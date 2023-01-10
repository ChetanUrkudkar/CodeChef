// https://www.codechef.com/problems/SUBSCRIBE_

package practice;

import java.util.*;
public class Subscriptions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int x = input.nextInt();
			
			if (n <= 6) {
				System.out.println(x);
			} else {
				int flag = n / 6;
				if (n % 6 != 0) {
					flag = flag + 1;
				}
				
				System.out.println(flag * x);
			}
		}
	}
}
