package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeSet;

public class CCC20S1 {

    static BufferedReader in;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Long> times = new TreeSet<>();
        HashMap<Long, Long> pairs = new HashMap<>();

        int n = Integer.parseInt(in.readLine());

        // Take in inputs
        for (int i = 0; i < n; i++) {
            String[] line = in.readLine().split(" ");

            long time = Integer.parseInt(line[0]);
            long pos = Integer.parseInt(line[1]);

            times.add(time);

            pairs.put(time, pos);
        }

        double speed = 0;

        // Solve for largest speed required
        for (int i = 1; i < n; i++) {
            long time1 = times.pollFirst();
            long time2 = times.first();

            long timeDif = Math.abs(time1 - times.first());
            long posDif = Math.abs(pairs.get(time1) - pairs.get(time2));

            double currentSpeed = (double) posDif / timeDif;

            speed = Math.max(speed, currentSpeed);
        }
        System.out.println(speed);
    }
}