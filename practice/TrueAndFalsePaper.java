// Link : https://www.codechef.com/submit/TFPAPER

package practice;

import java.util.*;
public class TrueAndFalsePaper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			
			System.out.println(n-k);
		}
	}
}
