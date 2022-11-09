// Link : https://www.codechef.com/submit/EQUALDIST

package practice;

import java.util.*;
public class EqualDistribution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			if (a == b) {
				System.out.println("YES");
			} else {
				int diff = b-a;
				if (diff < 0) {
					diff = diff * (-1);
				}
				
				if (diff % 2 == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
