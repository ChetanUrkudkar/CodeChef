// Link : https://www.codechef.com/submit/PARTY2

package practice;

import java.util.*;
public class ChefGivesParty {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while(t --> 0) {
			int n = input.nextInt();
			int x = input.nextInt();
			int k = input.nextInt();
			
			int tc = n * x;
			
			if (tc <= k) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
