// Link : https://www.codechef.com/problems/COURSEREG

package practice;
import java.util.*;

public class CourseRegistration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int m = input.nextInt();
			int k = input.nextInt();
			int diff =  m - k;
			if (diff >= n) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
