package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnevenSand {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static String userInput;

    public static void main(String[] args) throws IOException {
        long max = 2 * 1000 * 1000 * 1000;
        long min = 1;
        long mid = min + (max - min)/2;

        System.out.println(mid);
        System.out.flush();

        while (true) {

            userInput = in.readLine();

            if (userInput.equals("SINKS")) {
                min = mid - 1;
            } else if (userInput.equals("FLOATS")) {
                max = mid + 1;
            } else {
                return;
            }

            mid = min + (max - min)/2;
            System.out.println(mid);
            System.out.flush();
        }
    }
}