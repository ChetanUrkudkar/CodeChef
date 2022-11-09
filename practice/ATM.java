// Link : https://www.codechef.com/submit/HS08TEST

package practice;
import java.util.*;
import java.io.*;

public class ATM {
	public static void main(String[] args) throws IOException {
//		Scanner input = new Scanner(System.in);
//		
//		int with = input.nextInt();
//		double bal = input.nextDouble();
		
		InputStreamReader i = new InputStreamReader(System.in);
		
        BufferedReader input = new BufferedReader(i);
        String[] str = input.readLine().split(" ");
        int with = Integer.parseInt(str[0]);
        double bal = Double.parseDouble(str[1]);
		
		if (with < bal) {
			if (with % 5 == 0) {
				System.out.printf("%.2f", bal - (with + 0.50));
			} else {
				System.out.printf("%.2f", bal);
			}
		} else {
			System.out.printf("%.2f", bal);
		}
	}
}
