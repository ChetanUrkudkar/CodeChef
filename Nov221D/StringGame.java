// Link : https://www.codechef.com/NOV221D/problems/ABSTRING

package Nov221D;

import java.util.*;
public class StringGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			String s = input.next();
			
			int[] arr = new int[26];
			
			for (int i=0; i<n; i++) {
				int k = (int) s.charAt(i) - 97;
				arr[k] = arr[k] + 1;
			}
			
			int flag = 0;
			for (int x : arr) {
				if (x % 2 == 1) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
