package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {

    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        boolean[] list = new boolean[n + 1];

        String[] tokens = in.readLine().split(" ");
        for(int i = 1; i < n; i++) {
            int num = Integer.parseInt(tokens[i - 1]);

            list[num] = true;
        }
        for(int i = 1; i <= n; i++) {
            boolean bool = list[i];
            if(!bool) {
                System.out.println(i);
                return;
            }
        }
    }
}