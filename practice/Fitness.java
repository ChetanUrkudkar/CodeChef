// Link : https://www.codechef.com/submit/FIT

package practice;

import java.util.*;
public class Fitness {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int office = input.nextInt();
			
			System.out.println((office * 2) * 5);
		}
	}
}
