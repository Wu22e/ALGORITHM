package inflearn.string;
import java.util.*;

public class Problem01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = 0;
		String input1 = scanner.nextLine().toLowerCase();
		String input2 = scanner.nextLine().toLowerCase();
		for (char c : input1.toCharArray()) {
			if (c == input2.charAt(0)) {
				++answer;
			}
		}
		System.out.println(answer);
	}
}
