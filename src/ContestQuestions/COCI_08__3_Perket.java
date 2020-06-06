package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class COCI_08__3_Perket {

    static int n;
    static int[] sourness;
    static int[] bitterness;
    static int ans = 2 * 1000 * 1000 * 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(in.readLine());

        sourness =new int[n];
        bitterness = new int[n];

        for (int i = 0; i < n; i++) {
            String[] line = in.readLine().split(" ");

            sourness[i] = Integer.parseInt(line[0]);
            bitterness[i] = Integer.parseInt(line[1]);
        }

        recursion(0, 0, 1, false);
        System.out.println(ans);
    }

    public static void recursion(int index, int sum, int product, boolean taken) {
        if(index == n) {
            ans = Math.min(ans, Math.abs(sum - product));
            return;
        }
        recursion(index + 1, sum + bitterness[index], product * sourness[index], true);
        recursion(index + 1, sum, product, taken);
    }
}
