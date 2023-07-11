package inflearn.array;

import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int prev = arr[0];
        System.out.printf(prev + " ");
        for (int i = 1; i < N; i++) {
            if (prev < arr[i]) System.out.printf(arr[i] + " ");
            prev = arr[i];
        }
    }
}
