package practice;
import java.util.*;

public class FootballCup {
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
			if (arrx[i] !=0 && arry[i] !=0) {
				if (arrx[i] == arry[i]) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}	
		}
	}
}