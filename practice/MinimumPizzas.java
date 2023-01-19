// Link : https://www.codechef.com/problems/MINPIZZA

package practice;

import java.util.*;
public class MinimumPizzas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int x = input.nextInt();
			
			int slices = n * x;
			
			if (slices % 4 == 0) {
				System.out.println(slices / 4 );
			} else {
				System.out.println((slices / 4) + 1);
			}
		}
	}
}
