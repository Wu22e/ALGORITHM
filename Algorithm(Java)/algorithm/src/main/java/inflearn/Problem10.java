package inflearn;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray();
		char t = scanner.next().charAt(0);
		for (int i = 0; i < s.length; i++) {
			if(s[i] == t) {
				System.out.printf("0 ");
				continue;
			}
			int min_val = Integer.MAX_VALUE;
			for (int j = 0; j < s.length; j++) {
				if (s[j] == t) {
					if(min_val > Math.abs(i - j))
					min_val = Math.abs(i - j);
				}
			}
			System.out.printf("%d ", min_val);
		}
	}
}
