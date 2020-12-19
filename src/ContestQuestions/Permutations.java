package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        if(n == 3 || n == 2) {
            System.out.println("NO SOLUTION");
            return;
        }

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
