package inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem05_1 {
    public static void main(String[] args) {
        // 1. 스택을 사용한 방법
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        int N = input.length;
        List<String> stack = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (Character.isAlphabetic(input[i])) {
                stack.add(String.valueOf(input[i]));
            }
        }

        for (int i = 0; i < N; i++) {
            if (Character.isAlphabetic(input[i])) {
                input[i] = stack.remove(stack.size() - 1).charAt(0);
            }
        }

        System.out.println(String.valueOf(input));
    }
}
