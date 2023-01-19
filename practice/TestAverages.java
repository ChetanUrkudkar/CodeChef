// Link : https://www.codechef.com/problems/TESTAVG

package practice;

import java.util.*;
public class TestAverages {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			double FirstTwo = avg(a, b);
			double FirstLast = avg(a, c);
			double LastTwo = avg(b, c);
			
			if (FirstTwo >= 35 && FirstLast >=35 && LastTwo >= 35) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}
	}
	
	private static double avg(double num1, double num2) {
		// TODO Auto-generated method stub
		return ((num1 + num2) / 2);
	}
}
