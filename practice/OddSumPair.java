// Link : https://www.codechef.com/submit/ODDSUMPAIR

package practice;

import java.util.*;
public class OddSumPair {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = (input.nextInt() & 1) + (input.nextInt() & 1) + (input.nextInt() & 1);
			
			if (n > 0 && n < 3) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
