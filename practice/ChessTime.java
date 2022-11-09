// Link : https://www.codechef.com/submit/CHESSTIME

package practice;

import java.util.*;
public class ChessTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int n = input.nextInt();
			System.out.println((n * 60) / 20);
		}
	}
}
