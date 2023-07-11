package inflearn.string;

import java.util.Scanner;

public class Problem12_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String input = scanner.next();
		String answer = "";
		for (int i = 0; i < N; i++) {
			String answer_string = "";
			for (char c : input.substring(i * 7, (i + 1) * 7).toCharArray()) {
				if (c == '#') answer_string += '1';
				else answer_string += '0';
			}
			StringBuffer sb = new StringBuffer(answer_string).reverse();
			int decimal = 0;
			for (int j = 0; j < 7; j++) {
				decimal += Math.pow(2, j) * Integer.parseInt(String.valueOf(sb.charAt(j)));
			}
			answer += (char)decimal;
		}
		System.out.println(answer);
	}
}
