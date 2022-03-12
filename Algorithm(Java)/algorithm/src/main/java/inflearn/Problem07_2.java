package inflearn;

import java.util.Scanner;

public class Problem07_2 {
    // reverse() 사용
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String temp = new StringBuffer(input).reverse().toString();
        String answer = "NO";
        if(input.equalsIgnoreCase(temp)) answer = "YES";
        System.out.println(answer);
    }
}
