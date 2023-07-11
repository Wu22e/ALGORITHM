package fastcampus.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

/*
자연수 n과 m이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

- 1부터 n까지 자연수 중에서 m개를 고른 수열
- 같은 수를 여러 번 골라도 된다.

자연수 N과 M이 주어진다. (1 ≤ m ≤ n ≤ 7)


** 완전탐색 (재귀 이용)

** n 개 중 중복을 허용하여 m 개를 순서대로 나열하기 **

시간 복잡도 O(n^m) => 7^7 = 82만 (1초 내에 풀이 가능)
공간 복잡도 O(m) => m 개 선택하여 저장할 메모리

 */
public class BOJ_15651_NM3 {
    static StringBuilder sb = new StringBuilder();

    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
    }

    static int N, M;
    static int[] selected;

    // Recurrence Function (재귀 함수)
    // 만약 M 개를 전부 고름   => 조건에 맞는 탐색을 한 가지 성공한 것
    // 아직 M 개를 고르지 않음  => K 번째부터 M 번째 원소를 조건에 맞게 고르는 모든 방법을 시도
    static void rec_func(int k) {
        if (k == M + 1) { // 다 고른 경우
            // selected[1...M] 배열이 새롭게 탐색된 결과를 반환
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int cand = 1; cand <= N; cand++) {
                selected[k] = cand;
                // k+1 번 ~ M 번을 모두 탐색하는 일을 해야하는 상황
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();

        // 1 번째 원소부터 M 번째 원소를 조건에 맞는 모든 방법을 찾아 주는 재귀 함수.
        rec_func(1);
        System.out.println(sb.toString());
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(s));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
