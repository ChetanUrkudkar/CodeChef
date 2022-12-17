// Link : https://www.codechef.com/problems/CHEAPFOOD

package practice;
import java.util.*;

public class BestCoupon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			
			int c1 = (int) (x * 0.1);
			
			if (c1 > 100) {
				System.out.println(c1);
			} else {
				System.out.println(100);
			}
		}
	}
}