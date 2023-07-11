package inflearn.string;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        int max_length = Integer.MIN_VALUE;
        String answer = "";
        for (String word : words) {
            if (word.length() > max_length) {
                max_length = word.length();
                answer = word;
            }
        }
        System.out.println(answer);
    }
}
