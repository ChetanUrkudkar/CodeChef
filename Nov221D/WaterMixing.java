// Link : https://www.codechef.com/NOV221D/problems/WTRMIXING

package Nov221D;

import java.util.*;
public class WaterMixing {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (a == b) {
				System.out.println("YES");
			} else {
				if (a < b) {
					if ((b-a) <= x) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				} else {
					if ((a-b) <= y) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}
				}
			}
		}
	}
}
