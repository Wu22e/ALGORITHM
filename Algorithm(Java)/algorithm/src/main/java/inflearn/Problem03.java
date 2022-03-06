package inflearn;

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        int max_length = Integer.MIN_VALUE;
        for (String word : words) {
            if (word.length() > max_length) {
                max_length = word.length();
            }
        }
        for (String word : words) {
            if (word.length() == max_length) {
                System.out.println(word);
                return ;
            }
        }
    }

}
