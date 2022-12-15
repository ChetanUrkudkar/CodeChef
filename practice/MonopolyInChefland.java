// Link : https://www.codechef.com/problems/MONOPOLY

package practice;
import java.util.*;

public class MonopolyInChefland {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int r1 = input.nextInt();
			int r2 = input.nextInt();
			int r3 = input.nextInt();
			
			if ((r1 == r2) && (r2 == r3) && (r3 == r1)) {
				System.out.println("No");
			} else {
				if ((r1 + r2 >= r3) && (r2 + r3 >= r1) && (r3 + r1 >= r2)) {
					System.out.println("No");
				} else {
					System.out.println("yes");
				}
			}
		}
	}
}
