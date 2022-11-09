// Link : https://www.codechef.com/submit/INTEST

package practice;

import java.util.*;
//import java.io.*;
public class EnormousInputTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		int count = 0;
		
		for (int i=0; i<n; i++) {
			int temp = input.nextInt();
			if (temp % k == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}
	
//	static class InputReader {
//		public BufferedReader reader;
//		public StringTokenizer tokenizer;
//
//		public InputReader(InputStream stream) {
//			reader = new BufferedReader(new InputStreamReader(stream), 32768);
//			tokenizer = null;
//		}
//
//		public String next() {
//			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
//				try {
//				    tokenizer = new StringTokenizer(reader.readLine());
//				} catch (IOException e) {
//				    throw new RuntimeException(e);
//				}
//			}
//			return tokenizer.nextToken();
//		}
//
//		public int nextInt() {
//			return Integer.parseInt(next());
//		}
//	}
}
