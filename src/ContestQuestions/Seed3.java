package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seed3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int stationsNum = Integer.parseInt(in.readLine());
        int minTroops = Integer.parseInt(in.readLine());
        int waves = Integer.parseInt(in.readLine());

        int[] stations = new int[stationsNum + 2];
        int[] psa = new int[stationsNum + 2];

        int unsecureStation = 0;
        int initial;
        for (int i = 0; i < waves; i++) {
            String[] tokens = in.readLine().split(" ");
            initial = Integer.parseInt(tokens[0]);
            int last = Integer.parseInt(tokens[1]);
            int num = Integer.parseInt(tokens[2]);

            stations[initial] += num;
            stations[last + 1] -= num;
        }

        for (int i = 1; i <= stationsNum; i++) {
            psa[i] = psa[i - 1] + stations[i];
        }

        for (int i = 1; i <= stationsNum; i++) {
            if(psa[i] < minTroops) unsecureStation++;
        }
        System.out.println(unsecureStation);
    }
}
