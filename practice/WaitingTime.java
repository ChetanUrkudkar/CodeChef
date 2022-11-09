// Link : https://www.codechef.com/submit/WAITTIME 

package practice;

import java.util.*;
public class WaitingTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int k = input.nextInt();
			int x = input.nextInt();
			
			int totalDays = k * 7;
			int needMore = totalDays - x;
			
			System.out.println(needMore);
		}
	}
}
