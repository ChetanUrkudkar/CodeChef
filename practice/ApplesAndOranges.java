// Link : https://www.codechef.com/submit/APPLORNG

package practice;

import java.util.*;
public class ApplesAndOranges {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		
		if ((a+b) <= x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
