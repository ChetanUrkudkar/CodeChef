// Link : https://www.codechef.com/problems/WATERFLOW

package practice;
import java.util.*;

public class BucketAndWaterFlow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int w = input.nextInt();
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			
			int lit = w + (y * z);
			
			if (lit > x) {
				System.out.println("overflow");
			} else if (lit == x) {
				System.out.println("filled");
			} else {
				System.out.println("Unfilled");
			}
		}
	}
}
