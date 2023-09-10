// Link : https://www.codechef.com/problems/WATSCORE

package practice;

import java.util.*;
public class ThatIsMyScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();

			int[] arr = new int[100];
						
			for (int i=0; i<n; i++) {
				int p = input.nextInt();
				int s = input.nextInt();
				
				if (p < 9) {
					if (arr[p] < s) {
						arr[p] = s;
					}
				}
			}
			int sum = 0;
			for (int x : arr) {
				sum = sum + x;
			}
			
			System.out.println(sum);
		}
	}
}
