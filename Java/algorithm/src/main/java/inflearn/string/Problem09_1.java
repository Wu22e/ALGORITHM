package inflearn.string;

import java.util.Scanner;

public class Problem09_1 {
    // char 아스키 코드로 구현
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int answer = 0;
        for (char c : input.toCharArray()) {
            if(c >= 48 && c <= 57) { // '0' 의 아스키 숫자 = 48
                answer = answer * 10 + (c - 48);
            }
        }
        System.out.println(answer);
    }
}
