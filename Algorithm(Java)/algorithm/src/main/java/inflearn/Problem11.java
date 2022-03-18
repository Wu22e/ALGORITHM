package inflearn;

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String answer = "";
		char prev = input.charAt(0);
		int count = 1;
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == prev) {
				count++;
				if (i == input.length() - 1) {
					answer += input.charAt(i) + String.valueOf(count);
				}
			} else {
				answer += prev;
				if (count > 1) {
					answer += String.valueOf(count);
				}
				count = 1;
				if (i == input.length() - 1) {
					answer += input.charAt(i);
					break;
				}
				prev = input.charAt(i);
			}
		}
		System.out.println(answer);
	}
}
