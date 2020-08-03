package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class vmss7wc16c5p3 {
    static boolean[] visited;
    static int[] dist;
    static ArrayList<Integer>[] adj;
    static int farthest = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        adj = new ArrayList[n + 1];

        for(int i = 0; i < n; i++) {
            adj[i + 1] = new ArrayList<>();
        }

        visited = new boolean[n + 1];
        dist = new int[n + 1];

        for(int i = 1; i < n; i++) {
            String tokens = in.readLine();
            int node1 = Integer.parseInt(tokens.split(" ")[0]);
            int node2 = Integer.parseInt(tokens.split(" ")[1]);

            adj[node1].add(node2);
            adj[node2].add(node1);
        }

        dfs(1);
        int a = farthest;

        farthest = a;

        for(int i = 1; i <= n; i++) {
            visited[i] = false;
            dist[i] = 0;
        }

        dfs(a);
        int b = farthest;

        System.out.println(dist[b]);
    }

    public static void dfs(int current) {
        visited[current] = true;

        if (dist[current] > dist[farthest]) {
            farthest = current;
        }

        for (int neighbor : adj[current]) {
            if (visited[neighbor]) {
                continue;
            }

            dist[neighbor] = dist[current] + 1;
            dfs(neighbor);
        }
    }
}
