// Link : https://www.codechef.com/submit/BIRDFARM

package practice;

import java.util.*;
public class ChefAndBirdFarm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int chick = input.nextInt();
			int duck = input.nextInt();
			int legs = input.nextInt();
			
			int cFlag = 0;
			int dFlag = 0;
			
			if (legs % chick == 0) {
				cFlag = 1;
			}
			if (legs % duck == 0) {
				dFlag = 1;
			}
			
			if (cFlag == 1 && dFlag == 1) {
				System.out.println("ANY");
			} else {
				if (cFlag == 1) {
					System.out.println("CHICKEN");
				} else if (dFlag == 1) {
					System.out.println("DUCK");
				} else {
					System.out.println("NONE");
				}
			}
		}
	}
}
