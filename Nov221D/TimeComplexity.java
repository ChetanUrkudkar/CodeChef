// Link : https://www.codechef.com/NOV221D/problems/COMPLEXITY

package Nov221D;

import java.util.*;
public class TimeComplexity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (x > y) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
