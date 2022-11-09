// Link : https://www.codechef.com/submit/CONN

package practice;

import java.util.*;
public class ConstructN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = input.nextInt();
			
			if (n>=7) {
				System.out.println("YES");
			} else {
				if (n%2 == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
