// Link : https://www.codechef.com/submit/DETSCORE

package practice;

import java.util.*;
public class DetermineTheScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int n = input.nextInt();
			
			int points = x / 10;
			int score = points * n;
			
			System.out.println(score);
		}
	}
}
