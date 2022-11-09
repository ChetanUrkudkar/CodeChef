// Link : https://www.codechef.com/submit/CCHOCOLATES

package practice;

import java.util.*;
public class ChefAndChocolates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();
			
			int totrup = (x*5) + (y*10);
			
			System.out.println(totrup / z);
		}
	}
}
