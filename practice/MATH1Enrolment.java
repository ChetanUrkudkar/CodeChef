// Link : https://www.codechef.com/submit/M1ENROL

package practice;

import java.util.*;
public class MATH1Enrolment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int seats = input.nextInt();
			int studs = input.nextInt();
			
			int more = studs - seats;
			
			if (more <= 0) {
				System.out.println(0);
			} else {
				System.out.println(more);
			}
		}
	}
}
