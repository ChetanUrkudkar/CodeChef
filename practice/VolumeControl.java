// Link : https://www.codechef.com/submit/VOLCONTROL

package practice;

import java.util.*;
public class VolumeControl {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (x < y) {
				System.out.println(y - x);
			} else {
				System.out.println(x - y);
			}
		}
	}
}
