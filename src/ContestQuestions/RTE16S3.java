package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RTE16S3 {
    public static class Pair {
        int target;
        int length;

        public Pair(int target, int length) {
            this.target = target;
            this.length = length;
        }
    }

    static BufferedReader in;
    static int n;
    static int q;
    static ArrayList<Pair>[] adj;
    static int[][] dist;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    public static void solve() throws IOException {
        n = Integer.parseInt(in.readLine());
        adj = new ArrayList[6001];
        dist = new int[6001][6001];

        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            String[] tokens = in.readLine().split(" ");
            int classRoom1 = Integer.parseInt(tokens[0]);
            int classRoom2 = Integer.parseInt(tokens[1]);
            int length = Integer.parseInt(tokens[2]);

            adj[classRoom1].add(new Pair(classRoom2, length));
            adj[classRoom2].add(new Pair(classRoom1, length));
        }

        for(int i = 0; i < n;i++) {
            dfs(i, -1, i);
        }
        q = Integer.parseInt(in.readLine());

        for (int i = 0; i < q; i++) {
            String[] tokens = in.readLine().split(" ");

            int node1 = Integer.parseInt(tokens[0]);
            int node2 = Integer.parseInt(tokens[1]);

            System.out.println(dist[node1][node2] < 0 ? Integer.toUnsignedString(dist[node1][node2]) : dist[node1][node2]);
        }
    }

    public static void dfs(int current, int parent, int start) {
        for (Pair pair : adj[current]) {
            int neighbour = pair.target;
            int length = pair.length;

            if (neighbour == parent) {
                continue;
            }
            dist[start][neighbour] = dist[start][current] + length;
            dfs(neighbour, current, start);
        }
    }
}
