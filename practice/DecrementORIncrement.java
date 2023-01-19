// Link : https://www.codechef.com/problems/DECINC

package practice;

import java.util.*;
public class DecrementORIncrement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if (n % 4 == 0) {
			System.out.println(n + 1);
		} else {
			System.out.println(n - 1);
		}
	}
}
