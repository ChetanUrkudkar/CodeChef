// Link : https://www.codechef.com/submit/LTIME

package practice;

import java.util.*;
public class Lunchtime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			
			if (x >= 1 && x <= 4) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
