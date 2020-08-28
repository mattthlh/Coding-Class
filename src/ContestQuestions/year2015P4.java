package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class year2015P4 {
    static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    static int a;
    static int b;
    static int m;
    static String[] codes = {
            "chug A", "chug B",
            "fill A", "fill B",
            "pour A B", "pour B A"};
    static ArrayList<String> instructions = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = in.readLine().split(" ");
        a = Integer.parseInt(tokens[0]);
        b = Integer.parseInt(tokens[1]);
        m = Integer.parseInt(tokens[2]);

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));
        int currentA = 0;
        int currentB = 0;
        int count = 0;

        while(!queue.isEmpty()) {
            if (currentA == m || currentB == m) {
                for (String instruction : instructions) {
                    System.out.println(instruction);
                }
                System.exit(0);
            }
            int newA = currentA;
            int newB = currentB;

            // Fill A
            newA = a;
            queue.add(new Pair(newA , newB));

            // Fill B
            newB = b;
            queue.add(new Pair(currentA , b));

            // Pour A B
            if(b - currentB >= currentA) {
                currentB += currentA;
                currentA = 0;
            } else {
                int temp = b - currentB;
                currentB = b;
                currentA -= temp;
            }
            queue.add(new Pair(a , currentB));

            // Fill B
            queue.add(new Pair(currentA , b));
        }
    }
}
