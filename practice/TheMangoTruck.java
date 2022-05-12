package practice;
import java.util.*;

public class TheMangoTruck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		int[] arrx = new int[t];
		int[] arry = new int[t];
		int[] arrz = new int[t];
		
		for (int i=0; i<t; i++) {
			arrx[i] = input.nextInt();
			arry[i] = input.nextInt();
			arrz[i] = input.nextInt();
		}
		
		for (int i=0; i<t; i++) {
			int x = (arrz[i] - arry[i]) / arrx[i];
			if (x <= arrz[i]) {
				System.out.println(x);
			} else {
				System.out.println(0);
			}
		}
	}
}