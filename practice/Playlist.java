// Link : https://www.codechef.com/problems/SONGS

package practice;
import java.util.*;

public class Playlist {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			int x = input.nextInt();
			
			if (n > x) {
				System.out.println(n / (x * 3));
			} else {
				System.out.println(0);
			}
		}
	}
}
