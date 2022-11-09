// Link : https://www.codechef.com/submit/BUYLAMP

package practice;

import java.util.*;
public class BuyLamps {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int k = input.nextInt();
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (n == k) {
				System.out.println(n * x);
			} else {
				if (x > y) {
					int diff = n-k;
					System.out.println((k*x) + (diff*y));
				} else {
					System.out.println(n * x);
				}
			}
		}
	}
}
