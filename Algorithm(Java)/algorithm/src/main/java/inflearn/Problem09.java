package inflearn;

import java.util.Scanner;

public class Problem09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray();
		String answer = "";
		for (char c : input) {
			if (Character.isDigit(c)) {
				if(c == '0' && answer.isEmpty()) continue;
				answer += c;
			}
		}
		System.out.println(answer);
	}
}
