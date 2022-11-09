// Link : https://www.codechef.com/submit/MY1STCONTEST

package practice;

import java.util.*;
public class MyVery1stContest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		
		int ratingUsers = n - a;
		int solvedUsers = ratingUsers - b;
		
		System.out.println(ratingUsers + " " + solvedUsers);
	}
}
