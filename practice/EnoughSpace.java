// Link : https://www.codechef.com/submit/ENSPACE

package practice;

import java.util.*;
public class EnoughSpace {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int x = input.nextInt();
			int y = input.nextInt();
			
			int usedSpace = x + (y*2);
			
			if (usedSpace <= n) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
