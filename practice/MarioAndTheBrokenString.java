// Link : https://www.codechef.com/problems/BROKENSTRING

package practice;

import java.util.*;
public class MarioAndTheBrokenString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			String s = input.next();
			
			String s1 = s.substring(0, n/2);
			String s2 = s.substring(n/2);
			
			if (s.equals(s2+s1)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
