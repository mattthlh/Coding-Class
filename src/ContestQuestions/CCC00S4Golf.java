package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CCC00S4Golf {

    static BufferedReader in;
    static final int inf = 999999;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        int distance = Integer.parseInt(in.readLine());

        int amountOfClubs = Integer.parseInt(in.readLine());
        int[] clubsStrength = new int[amountOfClubs];

        for (int i = 0; i < amountOfClubs; i++) {
            int newClub = Integer.parseInt(in.readLine());
            clubsStrength[i] = newClub;
        }
        int n = dp(distance, clubsStrength);

        if(n == inf) {
            System.out.println("Roberta acknowledges defeat.");
        } else {
            System.out.println("Roberta wins in " + n + " strokes.");
        }
    }

    public static int dp(int dist, int[] clubs) {
        int[] dpArray = new int[dist + 1];
        Arrays.fill(dpArray, inf);
        dpArray[0] = 0;

        for(int i = 0; i <= dist; i++){
            for(int j = 0; j < clubs.length; j++) {
                if(i - clubs[j] >= 0) {
                    dpArray[i] = Math.min(dpArray[i],
                            dpArray[i - clubs[j]] + 1);
                }
            }
        }
        return dpArray[dist];
    }
}