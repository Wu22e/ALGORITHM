package inflearn;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        while (N != 0) {
            StringBuffer sb = new StringBuffer(scanner.nextLine());
            System.out.println(sb.reverse().toString());
            N--;
        }
    }
}
