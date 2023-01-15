// Link : https://www.codechef.com/problems/FCTRL2

package practice;

import java.util.*;
import java.math.*;
public class SmallFactorials {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while (t --> 0) {
			int n = input.nextInt();
			
            BigInteger fact = new BigInteger("1");
            for(int i = 2; i <= n; i++) {
            	fact = fact.multiply(BigInteger.valueOf(i));
            }
            
            System.out.println(fact);
		}
	}
}
