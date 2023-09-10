// Link : https://www.codechef.com/problems/ZCOSCH

package practice;

import java.util.*;
public class HowMuchScholarship {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int r = input.nextInt();
		
		if (1 >= r || r <= 50) {
			System.out.println(100);
		} else if (51 >= r || r <= 100) {
			System.out.println(50);
		} else {
			System.out.println(0);
		}
	}
}
