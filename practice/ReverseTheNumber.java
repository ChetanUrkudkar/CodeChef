// Link : https://www.codechef.com/submit/FLOW007

package practice;

import java.util.*;
public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = input.nextInt();
			
			int rev = 0;
			while (n > 0) {
				int temp = n % 10;
				rev = (rev * 10) + temp;
				n = n / 10;
			}
			System.out.println(rev);
		}
	}
}
