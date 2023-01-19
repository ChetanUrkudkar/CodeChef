// Link : https://www.codechef.com/problems/NUM239

package practice;

import java.util.*;
public class CountingPrettyNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int l = input.nextInt();
			int r = input.nextInt();
			
			int count = 0;
			for (int i=l; i<=r; i++) {
				boolean b = checker(i);
				if (b == true) {
					count += 1;
				}
			}
			System.out.println(count);
		}
	}
	
	private static boolean checker(int i) {
		// TODO Auto-generated method stub
		int n = i;

		int temp = n % 10;
		
		if (temp == 2 || temp == 3 || temp == 9) {
			return true;
		}
		
		return false;
	}
}
