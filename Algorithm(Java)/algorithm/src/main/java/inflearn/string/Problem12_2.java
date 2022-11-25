package inflearn.string;

import java.util.Scanner;

public class Problem12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String s = scanner.next();
        String answer = "";
        for (int i = 0; i < N; i++) {
            String temp = s.substring(0, 7).replace('#', '1').replace('*', '0'); // replace (char 문자 대체)
            int num = Integer.parseInt(temp, 2); // radix = 2 (2진수로 변환)
            answer += (char) num;
            s = s.substring(7);
        }
        System.out.println(answer);
    }
}
