package inflearn.string;

import java.util.Scanner;

public class Problem09_3 {
    // isDigit 이용 | parseInt를 이용한 숫자 추출
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        String answer = "";
        for (char c : input) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }
        System.out.println(Integer.parseInt(answer));
    }
}

