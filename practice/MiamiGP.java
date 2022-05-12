package practice;
import java.util.*;

public class MiamiGP {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		int[] arrx = new int[t];
		int[] arry = new int[t];
		
		for (int i=0; i<t; i++) {
			arrx[i] = input.nextInt();
			arry[i] = input.nextInt();
		}
		
		for (int i=0; i<t; i++) {
			double x = 1.07 * arrx[i];
			if (x >= arry[i]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
