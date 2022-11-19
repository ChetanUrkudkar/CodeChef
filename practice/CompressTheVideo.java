// Link : https://www.codechef.com/problems/COMPRESSVD

package practice;

import java.util.*;
public class CompressTheVideo {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			
			int[] arr = new int[n];
			
			for (int i=0; i<n; i++) {
				arr[i] = input.nextInt();
			}
			
			if (n == 1) {
				System.out.println(1);
			} else {
				
				int count = 1;
				for (int i=0; i<n-1; i++) {
					if (arr[i] != arr[i+1]) {
						count += 1;
					}
				}
				
				if (count == n) {
					System.out.println(n);
				} else {
					System.out.println(count);
				}
			}
		}
	}
}
