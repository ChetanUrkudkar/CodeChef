// Link : https://www.codechef.com/submit/AUCTION

package practice;

import java.util.*;
public class Bidding {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int[] arr = new int[3];
			for (int i=0; i<3; i++) {
				arr[i] = input.nextInt();
			}
			
			int maxi = arr[0];
			int pos = 0;
			for (int i=0; i<3; i++) {
				if (arr[i] > maxi) {
					maxi = arr[i];
					pos = i;
				}
			}
			
			if (pos == 0) {
				System.out.println("Alice");
			} else if (pos == 1) {
				System.out.println("Bob");
			} else {
				System.out.println("Charlie");
			}
		}
	}
}
