// Link : https://www.codechef.com/problems/TLG

package practice;

import java.util.*;
import java.math.*;
public class TheLeadGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int sums1=0;
        int sumt1 =0;
        int play1=0;
        int play2=0;
        for(int i=1 ; i<=n ;i++){
        	int s1 = input.nextInt();
        	int t1 = input.nextInt();
        	sums1 = sums1+ s1;
        	sumt1 = sumt1+t1;

        	if(sums1>sumt1){
        		play1 = Math.max(play1 ,sums1-sumt1);
        	} else if(sumt1>sums1) {
        		play2 = Math.max(play2 ,sumt1-sums1);
        	}
        }
              
        if(play1>play2){
        	System.out.println("1 " + play1 );
        } else if(play2 > play1) {
        	System.out.println("2 " + play2);
        }
	}
}
		
//		int[] lead = new int[n];
//		int[] leader = new int[n];
//		
//		for (int i=0; i<n; i++) {
//			int p1 = input.nextInt();
//			int p2 = input.nextInt();
//			
//			if (p1 > p2) {
//				leader[i] = 1;
//			} else {
//				leader[i] = 2;
//			}
//			
//			lead[i] = Math.abs(p1 - p2);
//		}
//		
//		int maxi = lead[0];
//		int indi = leader[0];
//		for (int i=0; i<n; i++) {
//			if (lead[i] > maxi) {
//				maxi = lead[i];
//				indi = leader[i];
//			} else {
//				continue;
//			}
//		}
//		
//		System.out.println(indi + " " + maxi);
//	}
//}
