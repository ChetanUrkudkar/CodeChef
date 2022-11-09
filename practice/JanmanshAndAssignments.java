// Link : https://www.codechef.com/submit/JASSIGNMENTS

package practice;

import java.util.*;
public class JanmanshAndAssignments {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			
			if (x + 3 <= 10) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
