// Link : https://www.codechef.com/problems/EZSPEAK

package practice;

import java.util.*;
public class EasyPronunciation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			String s = input.next();
			
			int count = 0;
			for (int i=0; i<n; i++) {
				int aski = (int)s.charAt(i);
				
				if (aski == 97 || aski == 101 || aski == 105 || aski == 111 || aski == 117) {
					count = 0;
				} else {
					count += 1;
					if (count == 4) {
						break;
					}
				}				
			}
			
			if (count == 4) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
