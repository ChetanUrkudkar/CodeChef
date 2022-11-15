// Link : https://www.codechef.com/problems/CARTRIP

package practice;

import java.util.*;
public class CarTrip {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			if (x >= 300) {
				System.out.println(x * 10);
			} else {
				System.out.println(3000);
			}
		}
	}
}
