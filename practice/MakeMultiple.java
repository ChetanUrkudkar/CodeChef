// Link : https://www.codechef.com/submit/MAKEMULTIPLE

package practice;

import java.util.*;
public class MakeMultiple {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i, t = input.nextInt();
		
		while (t --> 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			int quo = b / a;
			
			if (a == b) {
				System.out.println("YES");
			} else if (quo >=2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}