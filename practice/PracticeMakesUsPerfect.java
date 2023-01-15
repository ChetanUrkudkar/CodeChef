// Link : https://www.codechef.com/problems/PRACTICEPERF

package practice;

import java.util.*;
public class PracticeMakesUsPerfect {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[4];
			
		for (int i=0; i<4; i++) {
			arr[i] = input.nextInt();
		}
		
		int count = 0;
		for (int x : arr) {
			if (x >= 10) {
				count += 1;
			} else {
				continue;
			}
		}
		
		System.out.println(count);
	}
}
