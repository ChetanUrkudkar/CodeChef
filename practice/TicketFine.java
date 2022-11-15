// Link : https://www.codechef.com/problems/TCKTFINE

package practice;

import java.util.*;
public class TicketFine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			System.out.println(input.nextInt() * (input.nextInt() - input.nextInt()));
		}
	}
}
