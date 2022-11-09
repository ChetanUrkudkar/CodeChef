// Link : https://www.codechef.com/submit/AUDIBLEs

package practice;

import java.util.*;
public class AudibleRange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		while (t --> 0) {
			int x = input.nextInt();
			
			if ((x >= 67) && (x <= 45000)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
