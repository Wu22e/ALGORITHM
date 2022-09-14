package inflearn.array;

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 1, prevMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > prevMax) {
                count++;
                prevMax = arr[i];
            }
        }
        System.out.println(count);
    }
}
