// Link : https://www.codechef.com/problems/JCOINS

package practice;

import java.util.*;
public class JanmanshAndCoins {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			System.out.println((x*10) + (y*5));
		}
	}
}
