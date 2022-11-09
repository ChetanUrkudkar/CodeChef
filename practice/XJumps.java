// Link : https://www.codechef.com/submit/XJUMP

package practice;

import java.util.*;
public class XJumps {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			int quo = x / y;
			int rem = x % y;
			
			System.out.println(quo + rem);
		}
	}
}
