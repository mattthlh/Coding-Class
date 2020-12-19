package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DS1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = in.readLine().split(" ");

        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);
        int[] array = new int[n + 1];

        tokens = in.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(tokens[i - 1]);
        }

        for (int i = 0; i < m; i++) {
            tokens = in.readLine().split(" ");
            String operation = tokens[0];
            int num;
            int lastIndex;
            if(operation.equals("Q")) {
                num = 0;
                lastIndex = Integer.parseInt(tokens[1]);
            } else {
                num = Integer.parseInt(tokens[1]);
                lastIndex = Integer.parseInt(tokens[2]);
            }

            int answer = solve(operation, num, lastIndex, array);

            if(answer != -1) {
                System.out.println(answer);
            }
        }
    }

    public static int solve(String operation, int num, int lastIndex, int[] array) {
        int answer = 0;
        if(operation.equals("C")) {
            array[num] = lastIndex;
            return -1;
        } else if(operation.equals("S")) {

        } else {

        }
        return answer;
    }
}
