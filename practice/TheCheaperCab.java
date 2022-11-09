// Link : https://www.codechef.com/submit/CABS

package practice;

import java.util.*;
public class TheCheaperCab {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (x == y) {
				System.out.println("ANY");
			} else {
				if (x < y) {
					System.out.println("FIRST");
				} else {
					System.out.println("SECOND");
				}
			}
		}
	}
}
