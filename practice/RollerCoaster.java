package practice;
import java.util.*;

public class RollerCoaster {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		int[] sonHeight = new int[t];
		int[] minHeight = new int[t];
		
		for (int i=0; i<t; i++) {
			sonHeight[i] = input.nextInt();
			minHeight[i] = input.nextInt();
		}
		
		for (int i=0; i<t; i++) {
			if (sonHeight[i] < minHeight[i]) {
				System.out.println("NO");
			}
			else if (sonHeight[i] >= minHeight[i]) {
				System.out.println("YES");
			}
		}
	}
}
