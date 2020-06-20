package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class MWC15RoboticsSummative {

    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] rectangles = init(n);
        System.out.println(calculate(rectangles));
    }

    public static int[] init(int n) throws IOException{
        int[] rectangles = new int[n];

        String[] inputsAsString = in.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            rectangles[i] = Integer.parseInt(inputsAsString[i]);
        }
        Arrays.sort(rectangles);
        return rectangles;
    }

    public static long calculate(int[] rectangles) {
        int[] area = new int[2];
        ArrayList<Long> areas = new ArrayList<>();
        int count = 0;
        for(int i = rectangles.length - 1; i > 0;) {

            int highest = rectangles[i];
            int secondHighest = rectangles[i - 1];

            if (highest - secondHighest <= 1) {
                if(count < 1) {
                    area[count] = secondHighest;
                    count++;
                } else {
                    area[count] = secondHighest;
                    areas.add((long)area[0] * area[1]);
                    count = 0;
                    area[0] = 0;
                    area[1] = 0;
                }
                i-=2;
            } else {
                i-=1;
            }
        }
        long totalArea = 0;
        for(int i = 0; i < areas.size(); i++) {
            totalArea += areas.get(i);
        }
        return totalArea;
    }
    /*
    1. Input
    2. Calculate
    3. Output
     */
}