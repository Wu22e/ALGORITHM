package inflearn.string;

import java.util.Scanner;

public class Problem05_2 {
    public static void main(String[] args) {
        // 2. 이중포인터 이용
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        int lt = 0, rt = input.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(input[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(input[rt])) {
                rt--;
            } else {
                char temp = input[lt];
                input[lt] = input[rt];
                input[rt] = temp;
                lt++;
                rt--;
            }
        }

        System.out.println(String.valueOf(input));

    }
}
