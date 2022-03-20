package inflearn.string;


import java.util.Scanner;

public class Problem08_1 {
    public static void main(String[] args) {
        // 투 포인터 이용
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toLowerCase().toCharArray();
        int lt = 0, rt = input.length - 1;
        boolean flag = false;
        while (lt < rt) {
            if (!Character.isAlphabetic(input[lt])) lt++;
            else if (!Character.isAlphabetic(input[rt])) rt--;
            else {
                if (input[lt] != input[rt]) {
                    flag = true;
                    break;
                }
                lt++;
                rt--;
            }
        }

        if (flag) System.out.println("NO");
        else System.out.println("YES");
    }
}
