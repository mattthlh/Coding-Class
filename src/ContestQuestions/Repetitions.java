package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {

    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        String line = in.readLine();

        long total = 1;
        long count = 1;
        char mostChar = line.charAt(0);

        for(int i = 0; i < line.length() - 1; i++) {
            char char1 = line.charAt(i);
            char char2 = line.charAt(i + 1);
            if(char1 == char2) {
                count++;
            } else {
                if(total < count) {
                    total = count;
                    count = 1;
                    mostChar = line.charAt(i);
                }
            }
        }
        if(total < count) {
            total = count;
        }

        System.out.println(total);
        System.out.println(mostChar);
    }
}