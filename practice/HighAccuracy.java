// Link : https://www.codechef.com/submit/ACCURACYss

package practice;

import java.util.*;
public class HighAccuracy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int x = input.nextInt();
			
			if (x % 3 == 0) {
				System.out.println(0);
			} else {
				int quo = x / 3;
				int right = (quo * 3) + 3;
				int wrong = right - x;
				
				System.out.println(wrong);
			}
		}
	}
}
