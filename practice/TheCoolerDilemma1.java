// Link : https://www.codechef.com/problems/WATERCOOLER1 

package practice;

import java.util.*;
public class TheCoolerDilemma1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int m = input.nextInt();
			int y = input.nextInt();
			
			if ((x*y) < m) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
