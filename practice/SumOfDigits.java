// Link : https://www.codechef.com/submit/FLOW006

package practice;

import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();

		int[] arr = new int[t];
		
		for (int i=0; i<t; i++) {
			arr[i] = input.nextInt();
		}
				
		for (int i=0; i<t; i++) {
			int n = arr[i];
			int sum = 0;
			while (n != 0) {
				int temp = n % 10;
				sum = sum + temp;
				n = n / 10;
			}
			System.out.println(sum);
		}
	}
}
