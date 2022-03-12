package inflearn;

import java.util.Scanner;

public class Problem07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toLowerCase().toCharArray();
        String answer = "YES";
        for (int i = 0; i < input.length / 2; i++) {
            if (input[i] != input[input.length - 1 - i]) {
                answer = "NO";
            }
        }

        System.out.println(answer);
    }
}
