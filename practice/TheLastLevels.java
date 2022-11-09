// Link : https://www.codechef.com/submit/LASTLEVELS

package practice;

import java.util.*;
public class TheLastLevels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			
			int min = 0;
			
			while (x > 3) {
				min += (3*y+z);
				x -= 3;
			}
			if (x <= 3) {
				min += x * y;
			}
			System.out.println(min);
		}
	}
}
