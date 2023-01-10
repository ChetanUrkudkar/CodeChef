// Link : https://www.codechef.com/problems/AVGPROBLEM

package practice;

import java.util.*;
public class GreaterAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			double avg = ((double)a+(double)b)/2;
			
			if (avg > (double)c) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
