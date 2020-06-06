package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        long[] data = new long[5];
        int[] max = new int[5];
        int[] Ks = new int[5];
        System.out.println(data.length);

        for (int i = 0; i < data.length; i++) {
            String[] line = in.readLine().split(" ");

            Ks[i] = Integer.parseInt(line[0]);
            data[i] = (long) Math.pow(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
        }
        int count;
        int iterate;
        for (int i = 0; i < max.length; i++) {
            iterate = Ks[i];
            int multiplier = Ks[i];
            int filler = Ks[i];
            count = 0;
            while (filler < data[i]) {
                filler =  iterate * multiplier;

                if(filler < data[i]) {
                    iterate = filler;
                    count++;
                }
            }
            max[i] = count;
        }
        long total = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < max[i]; j++) {
                total += data[i]/(Ks[i] * (long)Math.pow(Ks[i], j));
            }
            System.out.println(total);
        }
    }
}
