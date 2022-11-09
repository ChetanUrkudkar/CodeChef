// Link : https://www.codechef.com/submit/CNTWRD

package practice;

import java.util.*;
public class CountingWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int pages = input.nextInt();
			int words = input.nextInt();
			System.out.println(pages * words);
		}
	}
}