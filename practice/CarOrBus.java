package practice;

import java.util.*;
public class CarOrBus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for (int i=0; i<t; i++) {
			int bike = input.nextInt();
			int car = input.nextInt();
			
			if (bike < car) {
				System.out.println("BIKE");
			} else if (car < bike) {
				System.out.println("CAR");
			} else {
				System.out.println("SAME");
			}
		}
	}
}
