// Link : https://www.codechef.com/problems/HAPPYSTR

package practice;

import java.util.*;
public class ChefAndHappyString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			String s = input.next();
			
			int count = 0;
			
			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
					count += 1;
					if (count > 2) {
						break;
					}
				} else {
					count = 0;
				}
			}
			
			if (count > 2) {
				System.out.println("Happy");
			} else {
				System.out.println("Sad");
			}
		}
	}
}
