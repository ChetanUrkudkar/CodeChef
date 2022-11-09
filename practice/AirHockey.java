// Link : https://www.codechef.com/submit/AIRHOCKEY

package practice;

import java.util.*;
public class AirHockey {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while(t --> 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			int maxi = 0;
			
			if (a > b) {
				maxi = a;
			} else {
				maxi = b;
			}
			
			System.out.println(7-maxi);
		}
	}
}
