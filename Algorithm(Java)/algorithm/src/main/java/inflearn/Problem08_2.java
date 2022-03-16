package inflearn;

import java.util.Scanner;

public class Problem08_2 {
    // reverse 사용
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String answer = "NO";
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuffer(input).reverse().toString();
        if(input.equals(temp)) answer = "YES";
        System.out.println(answer);
    }
}
