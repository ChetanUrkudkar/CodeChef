// Link : https://www.codechef.com/problems/CREDS

package practice;

import java.util.*;
public class NumberOfCredits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			System.out.println((input.nextInt() * 4) + (input.nextInt() * 2) + (input.nextInt() * 0));
		}
	}
}
