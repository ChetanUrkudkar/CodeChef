// Link : https://www.codechef.com/submit/FAIRPASS

package practice;

import java.util.*;
public class PassesForFair {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int k = input.nextInt();
			
			if ((n+1) > k) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
