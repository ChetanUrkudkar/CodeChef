// Link : https://www.codechef.com/problems/EXPERT

package practice;

import java.util.*;
public class ExpertSetter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int y = input.nextInt();
			int x = input.nextInt();
			
			int approved = (x * 100) / y;
			
			if (approved >= 50) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
