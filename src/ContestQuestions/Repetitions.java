package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {

    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        String line = in.readLine();

        int total = 0;
        int current = 1;
        char symbol;

        if(line.length() == 1) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i < line.length(); i++) {
            symbol = line.charAt(i - 1);
            if(line.charAt(i) == symbol) {
                current++;
            } else {
                total = Math.max(total, current);
                current = 1;
            }
        }
        total = Math.max(total, current);

        System.out.println(total);
    }
}