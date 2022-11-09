// Link : https://www.codechef.com/submit/THREETOPICS

package practice;

import java.util.*;
public class TheThreeTopics {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for (int i=0; i<3; i++) {
			arr[i] = input.nextInt();
		}
		
		int x = input.nextInt();
		
		int flag = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == x) {
				flag = 1;
				break;
			}
		}
		
		if (flag == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
