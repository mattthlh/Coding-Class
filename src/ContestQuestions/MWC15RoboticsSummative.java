package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MWC15RoboticsSummative {

    static BufferedReader in;
    static int[] countingSort = new int[1000*1000+1];

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] rectangles = init(n);
        System.out.println(calculate(rectangles));
    }

    public static int[] init(int n) throws IOException{
        String[] inputsAsString = in.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int index = Integer.parseInt(inputsAsString[i]);
            int count = countingSort[index];
            countingSort[index] = count + 1;
        }

        int[] rectangles = new int[n];

        int index = 0;
        for (int i = 0; i <= 1000*1000; i++) {
            for (int j = 0; j < countingSort[i]; j++) {
                rectangles[index] = i;
                index++;
            }
        }

        return rectangles;
    }

    public static long calculate(int[] rectangles) {
        long totalArea = 0;
        boolean hasFirstSide = false;
        int firstSide = 0;
        for(int i = rectangles.length - 1; i > 0;) {

            int highest = rectangles[i];
            int secondHighest = rectangles[i - 1];

            // considered pairs
            if (highest - secondHighest <= 1) {
                if(!hasFirstSide) {
                    firstSide = secondHighest;
                } else {
                    totalArea += (long)firstSide * secondHighest;
                }
                hasFirstSide = !hasFirstSide;

                // remove both
                i-=2;

            // if not, then remove
            } else {
                i-=1;
            }
        }
        return totalArea;
    }
    /*
    1. Input
    2. Calculate
    3. Output
     */
}