package ClassChallenges;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int n = 4;
        int[] s = new int[]{1,2,3};
        int m = s.length;

        System.out.println(coinChange(n, m, s));
    }

    static long coinChange(int n, int m, int[] s) {
        long[] table = new long[n+1];

        Arrays.fill(table, 0);

        table[0] = 1;
        for(int i = 0; i < m; i++)
            for (int j = s[i]; j <= n; j++)
                table[j] += table[j - s[i]];

            return table[n];
    }
}
