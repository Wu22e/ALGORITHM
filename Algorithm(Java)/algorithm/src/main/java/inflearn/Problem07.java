package inflearn;

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toLowerCase().toCharArray();
        boolean flag = false;
        for (int i = 0; i < input.length / 2; i++) {
            if (input[i] != input[input.length - 1 - i]) {
                flag = true;
            }
        }

        if (flag) System.out.println("NO");
        else System.out.println("YES");
    }
}
