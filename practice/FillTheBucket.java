// Link : https://www.codechef.com/submit/FBC

package practice;

import java.util.*;
public class FillTheBucket {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int k = input.nextInt();
			int x = input.nextInt();
			
			System.out.println(k - x);
		}
	}
}
