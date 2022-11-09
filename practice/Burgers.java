// Links : https://www.codechef.com/submit/BURGERS

package practice;

import java.util.*;
public class Burgers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while(t --> 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			int burgers = 0;
			
			if (a == b) {
				burgers = a;
			} else {
				if (a < b) {
					burgers = a;
				} else {
					burgers = b;
				}
			}
			System.out.println(burgers);
		}
	}
}
