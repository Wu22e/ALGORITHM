package inflearn.string;

import java.util.Scanner;

public class Problem09_2 {
	// isDigit 이용 | 조건식을 이용한 숫자 추출
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
