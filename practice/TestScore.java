// Link : https://www.codechef.com/submit/CHEFSCORE

package practice;

import java.util.*;
public class TestScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (y % x == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
