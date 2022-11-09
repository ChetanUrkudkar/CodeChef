// Link : https://www.codechef.com/submit/BOOKPACK

package practice;

import java.util.*;
public class PackingBooks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			
			if (y % z == 0) {
				System.out.println(x * (y / z));
			} else {
				System.out.println(x * ((y / z) + 1));
			}
		}
	}
}
