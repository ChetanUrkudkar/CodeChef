// Link : https://www.codechef.com/problems/LUCKYFR

package practice;

import java.util.*;
public class LuckyFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			
			int count = 0;
			
			while (n != 0) {
				int temp = n % 10;
				if (temp == 4) {
					count++;
				}
				n = n / 10;
			}
			System.out.println(count);
		}
	}
}
