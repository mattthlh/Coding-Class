package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DPAFrog {

    private static String[] stringHeights;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        stringHeights = in.readLine().split(" ");

        System.out.println(minimumJumpCost(n));
    }

    public static int minimumJumpCost(int n) {
        int first = 0;
        int second =
            Math.abs(Integer.parseInt(stringHeights[1]) - Integer.parseInt(stringHeights[0]));

        for(int i = 2; i < n; i++) {
            if (i%2 == 0)
                first = Math.min(Math.abs(Integer.parseInt(stringHeights[i])
                    - Integer.parseInt(stringHeights[i-1])) + second, Math.abs(Integer.parseInt(stringHeights[i])
                    - Integer.parseInt(stringHeights[i-2])) + first);
            else
                second = Math.min(Math.abs(Integer.parseInt(stringHeights[i])
                        - Integer.parseInt(stringHeights[i-1])) + first,

                        Math.abs(Integer.parseInt(stringHeights[i])
                        - Integer.parseInt(stringHeights[i-2])) + second);

        }
        return n%2 == 1 ? first : second;
    }
}


/*

package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DPAFrog {
    private static String[] stringHeights;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        stringHeights = in.readLine().split(" ");

        System.out.println(minimumJumpCost(n));
    }

    private static int getHeight(int index) {
        return Integer.parseInt(stringHeights[index]);
    }

    public static int minimumJumpCost(int n) {
        int[] cost = new int[n];
        cost[0] = 0;
        cost[1] = Math.abs(getHeight(1) - getHeight(0));

        for(int i = 2; i < n; i++) {
            int costJumpOne =
                Math.abs(getHeight(i) - getHeight(i-1)) + cost[i - 1];
            int costJumpTwo =
                Math.abs(getHeight(i) - getHeight(i-2)) + cost[i - 2];
            cost[i] = Math.min(costJumpOne, costJumpTwo);
        }
        return cost[n - 1];
    }
}
 */