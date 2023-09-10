// Link : https://www.codechef.com/problems/BLITZ3_2

package practice;

import java.util.*;
public class ChessMatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			System.out.println((2 * (180 + a) - (b + c)));
		}
	}
}
