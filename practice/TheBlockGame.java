// Link : https://www.codechef.com/problems/PALL01

package practice;

import java.util.*;
public class TheBlockGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int m = n;
			String p = "";
			while (n != 0) {
				int temp = n % 10;
				n = n / 10;
				p = p + String.valueOf(temp);
			}
			
			if (m == Integer.parseInt(p)) {
				System.out.println("wins");
			} else {
				System.out.println("loses");
			}
		}
	}
}
