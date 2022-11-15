// Link : https://www.codechef.com/problems/CWIREFRAME

package practice;

import java.util.*;
public class ChefAndWireFrames {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			System.out.println(((2 * input.nextInt()) + (2 * input.nextInt())) * input.nextInt());
		}
	}
}
