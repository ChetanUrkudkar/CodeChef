// Link : https://www.codechef.com/submit/MINCOINSREQ

package practice;

import java.util.*;
public class MinimumCoins {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int x = input.nextInt();
			
			System.out.println(x % 10);
		}
	}
}
