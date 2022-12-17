// Link : https://www.codechef.com/problems/CHEFCHOCO

package practice;
import java.util.*;

public class ChefAndChocolates2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int c = input.nextInt();
			int x = input.nextInt();
			int y = input.nextInt();
			
			System.out.println((c - x) * y);
		}
	}
}
