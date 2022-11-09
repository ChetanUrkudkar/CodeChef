// Link : https://www.codechef.com/submit/BIRYANI 

package practice;

import java.util.*;
public class BiryaniClasses {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int week = input.nextInt();
			int cost = input.nextInt();
			
			System.out.println(week * cost);
		}
	}
}
