package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC13S4 {

    static BufferedReader in;
    static int n;
    static int m;
    static ArrayList<Integer>[] adj;
    static boolean visited[];
    static boolean found = false;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        String line = in.readLine();

        n = Integer.parseInt(line.split(" ")[0]);
        m = Integer.parseInt(line.split(" ")[1]);
        adj = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for(int i = 1; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }

    }
    public static void dfs(int current, int target) {
        if(current == target) {
            found = true;
        }
        visited[current] = true;
        for(int to : adj[current]) {
            if(visited[to]) continue;

            dfs(to, target);
        }
    }
}