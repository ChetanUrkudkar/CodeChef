// // Link : https://www.codechef.com/submit/CHEFCAND

package practice;

import java.util.*;
public class ChefAndChapters {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int course = input.nextInt();
			int unit = input.nextInt();
			int chapter = input.nextInt();
			
			System.out.println(course*unit*chapter);
		}
	}
}
