// Link : https://www.codechef.com/submit/ADVANCE

package practice;

import java.util.*;
public class RatingImprovement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			int maxLimit = x + 200;
			
			if (y>= x && y <= maxLimit) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
