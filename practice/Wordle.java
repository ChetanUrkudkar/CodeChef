// Link : https://www.codechef.com/problems/WORDLE

package practice;

import java.util.*;
public class Wordle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			String a = input.next();
			String b = input.next();
			
			String c = "";
			
			for (int i=0; i<a.length(); i++) {
				if (a.charAt(i) == b.charAt(i)) {
					c = c + "G";
				} else {
					c = c + "B";
				}
			}
			System.out.println(c);
		}
	}
}
