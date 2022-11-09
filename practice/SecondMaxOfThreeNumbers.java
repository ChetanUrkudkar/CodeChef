// Link : https://www.codechef.com/submit/SNDMAX

package practice;

import java.util.*;
public class SecondMaxOfThreeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();

		for (int i=0; i<t; i++) {
			int[] arr = new int[3];
			for (int j=0; j<3; j++) {
				arr[j] = input.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[1]);
		}
	}
}