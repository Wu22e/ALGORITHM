package inflearn;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char[] chars = input.toCharArray();
		int length = chars.length;
		for (int i = 0; i < length; i++) {
			if (Character.isUpperCase(chars[i])) {
				chars[i] = Character.toLowerCase(chars[i]);
			} else {
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}

		System.out.println(String.valueOf(chars));
	}
}
