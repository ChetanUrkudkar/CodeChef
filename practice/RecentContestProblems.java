// Link : https://www.codechef.com/problems/RECENTCONT

package practice;

import java.util.*;
public class RecentContestProblems {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			
			String[] codes = new String[n];
			
			for (int i=0; i<n; i++) {
				codes[i] = input.next();
			}
			
			int sc = 0;
			int lc = 0;
			
			for (int i=0; i<n; i++) {
				if (codes[i].equals("START38")) {
					sc += 1;
				} else {
					lc += 1;
				}
			}
			
			System.out.println(sc + " " + lc);
		}
	}
}
