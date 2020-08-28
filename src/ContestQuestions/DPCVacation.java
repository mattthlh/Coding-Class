package ContestQuestions;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DPCVacation {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        int[][] happiness = new int[n][3];

        for(int i = 0; i < n; i++) {
            String[] tokens = in.readLine().split(" ");

            happiness[i][0] = Integer.parseInt(tokens[0]);
            happiness[i][1] = Integer.parseInt(tokens[1]);
            happiness[i][2] = Integer.parseInt(tokens[2]);
        }

        System.out.println(dp(n, happiness));
    }

    public static int dp(int n, int[][] happiness) {
        int[] dp = new int[n + 1];
        dp[0] = -1;
        char lastActivityDone;

        for(int i = 1; i <= n; i++) {
            dp[i] = Math.max(dp[i], happiness[i][0]);
        }
        return 1;
    }
}
