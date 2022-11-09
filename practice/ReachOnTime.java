// Link : https://www.codechef.com/submit/TIMELY

package practice;

import java.util.*;
public class ReachOnTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			if (x < 30) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
