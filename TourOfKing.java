package Practice;

import java.util.*;
public class TourOfKing {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int t = input.nextInt();
		
		while (t-->0) {
			int n = input.nextInt();
			int m = input.nextInt();
			
			System.out.println((n*5) + (m*7));
		}
	}
}
