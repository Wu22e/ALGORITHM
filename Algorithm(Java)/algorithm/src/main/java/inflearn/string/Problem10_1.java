package inflearn.string;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10_1 {
    // 양방향 탐색으로 풀기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char target = scanner.next().charAt(0);
        int[] answer = new int[input.length()];
        int min_dist = 101; // 문자열이 100을 넘지 않음.
        // 왼쪽 탐색
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                min_dist = 0;
                answer[i] = min_dist;
            } else {
                min_dist++;
                answer[i] = min_dist;
            }
        }
        // 오른쪽 탐색
        min_dist = 101;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == target) min_dist = 0;
            else {
                min_dist++;
                answer[i] = Math.min(answer[i], min_dist);
            }
        }
        for (int dist : answer) {
            System.out.printf("%d ", dist);
        }
    }
}
