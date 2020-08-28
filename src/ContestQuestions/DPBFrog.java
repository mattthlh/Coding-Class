package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DPBFrog {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = in.readLine().split(" ");

        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);
        int[] h = new int[n + 1];

        tokens = in.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println(dp(n, k, h));
    }

    public static int dp(int n, int k, int[] h) {
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            dp[i] = Math.abs(h[i] - h[i - 1]) + dp[i - 1];
            for(int j = 2; j <= k; j++) {
                if(i - j >= 0) {
//                    System.out.println("DP[i - j]: " + dp[i - j]);
//                    System.out.println("DP[i]: " + dp[i]);
//                    System.out.println("h[i] - h[i - j]: " + (h[i] - h[i - j]));
                    dp[i] = Math.min(dp[i], Math.abs(h[i] - h[i - j]) + dp[i - j]);
                }
            }
        }
        return dp[n - 1];
    }
}
