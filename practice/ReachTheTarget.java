// Link : https://www.codechef.com/submit/REACHTARGET

package practice;

import java.util.*;
public class ReachTheTarget {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t --> 0) {
			int y = input.nextInt();
			int x = input.nextInt();
			System.out.println(y-x);
		}
	}
}
