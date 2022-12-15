// Link : https://www.codechef.com/problems/INSURANCE

package practice;
import java.util.*;

public class Insurance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (x >= y) {
				System.out.println(y);
			} else {
				System.out.println(x);
			}
		}
	}
}
