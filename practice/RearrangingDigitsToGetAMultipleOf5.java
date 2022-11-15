// Link : https://www.codechef.com/problems/DIGARR

package practice;

import java.util.*;
public class RearrangingDigitsToGetAMultipleOf5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int d = input.nextInt();
			String s = input.next();
			
			int flag = 0;
			for (int i=0; i<d; i++) {
				if (Integer.parseInt(String.valueOf(s.charAt(i))) % 5 == 0 ) {
					flag = 1;
					break;
				}
			}
			if (flag == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
