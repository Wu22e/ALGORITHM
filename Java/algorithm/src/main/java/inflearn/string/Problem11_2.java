package inflearn.string;

import java.util.Scanner;

public class Problem11_2 {
    // 인접 인덱스 비교 / cnt 누적
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String answer = "";
        s = s + " "; // 끝에 빈 문자열 추가
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
        System.out.println(answer);
    }
}
