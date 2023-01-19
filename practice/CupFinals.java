// Link : https://www.codechef.com/problems/CRICUP

package practice;

import java.util.*;
import java.lang.*;
public class CupFinals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			int d = input.nextInt();
			
			if (Math.abs(x-y) <= d) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
