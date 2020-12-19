package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class year2015P4 {
    static class State {
        int a;
        int b;

        public State(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static class Trace {
        int previousA;
        int previousB;
        int operation;

        public Trace(int a, int b, int o) {
            previousA = a;
            previousB = b;
            operation = o;
        }
    }


    static int a;
    static int b;
    static int m;
    static Trace[][] trace = new Trace[1001][1001];
    static String[] codes = {
            "chug A", "chug B",
            "fill A", "fill B",
            "pour A B", "pour B A"};

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] tokens = in.readLine().split(" ");
        a = Integer.parseInt(tokens[0]);
        b = Integer.parseInt(tokens[1]);
        m = Integer.parseInt(tokens[2]);

        boolean[][] vist = new boolean[1001][1001];
        Queue<State> queue = new LinkedList<>();
        queue.offer(new State(0, 0));
        vist[0][0] = true;

        int newA;
        int newB;

        while (!queue.isEmpty()) {
            State state = queue.poll();
            int currentA = state.a;
            int currentB = state.b;

            if (currentA == m || currentB == m) {
                traceAnswer(currentA, currentB);
                return;
            }

            if (!vist[0][currentB]) {
                queue.offer(new State(0, currentB));
                vist[0][currentB] = true;
                trace[0][currentB] = new Trace(currentA, currentB, 0);
            }

            if (!vist[currentA][0]) {
                queue.offer(new State(currentA, 0));
                vist[currentA][0] = true;
                trace[currentA][0] = new Trace(currentA, currentB, 1);
            }

            if (!vist[a][currentB]) {
                queue.offer(new State(a, currentB));
                vist[a][currentB] = true;
                trace[a][currentB] = new Trace(currentA, currentB, 2);
            }

            if (!vist[currentA][b]) {
                queue.offer(new State(currentA, b));
                vist[currentA][b] = true;
                trace[currentA][b] = new Trace(currentA, currentB, 3);
            }

            if (currentA + currentB > b) {
                newA = currentA + currentB - b;
                newB = b;
            } else {
                newA = 0;
                newB = currentA + currentB;
            }

            if (!vist[newA][newB]) {
                queue.offer(new State(newA, newB));
                vist[newA][newB] = true;
                trace[newA][newB] = new Trace(currentA, currentB, 4);
            }

            if (currentA + currentB > a) {
                newA = a;
                newB = currentA + currentB - a;
            } else {
                newA = currentA + currentB;
                newB = 0;

            }
            if (!vist[newA][newB]) {
                queue.offer(new State(newA, newB));
                vist[newA][newB] = true;
                trace[newA][newB] = new Trace(currentA, currentB, 5);
            }
        }

        System.out.println("Not possible");
    }

    public static void traceAnswer(int currentA, int currentB) {
        if(currentA == 0 && currentB == 0) return;
        Trace t = trace[currentA][currentB];
        traceAnswer(t.previousA, t.previousB);
        System.out.println(codes[t.operation]);
    }
}
