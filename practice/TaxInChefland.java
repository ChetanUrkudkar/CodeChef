// Link : https://www.codechef.com/submit/TAXES

package practice;

import java.util.*;
public class TaxInChefland {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		while (t --> 0) {
			int x = input.nextInt();
			if (x > 100) {
				System.out.println(x - 10);
			} else {
				System.out.println(x);
			}
		}
	}
}
