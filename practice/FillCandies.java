// Link : https://www.codechef.com/submit/FILLCANDIES

package practice;

import java.util.*;
public class FillCandies {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int k = input.nextInt();
			int m = input.nextInt();
			
			int multi = k * m;
			
			if (multi >= n) {
				System.out.println(1);
			} else {
				if (n % multi == 0) {
					System.out.println(n/multi);
				} else {
					System.out.println((n/multi)+1);
				}
			}			
		}
	}
}