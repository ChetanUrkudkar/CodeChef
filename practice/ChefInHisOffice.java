// Link : https://www.codechef.com/problems/OFFICE

package practice;

import java.util.*;
public class ChefInHisOffice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			System.out.println((x * 4) + y);
		}
	}
}
