package inflearn;

import java.util.Scanner;

public class Problem06_2 {
    // indexOf 사용
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String answer = "";
        for (int i = 0; i < input.length(); i++) {
            if(input.indexOf(input.charAt(i)) == i) answer += input.charAt(i);
        }
        System.out.println(answer);
    }
}
