// Link : https://www.codechef.com/submit/TODOLIST

package practice;

import java.util.*;
public class ProblemsInYourToDoList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int td = input.nextInt();
			
			int count = 0;
			int[] arr = new int[td];			
			for (int j=0; j<td; j++) {
				arr[j] = input.nextInt();
			}
			
			for (int j=0; j<arr.length; j++) {
				if (arr[j] >= 1000) {
					count += 1;
				}
			}
			System.out.println(count);
		}
	}
}
