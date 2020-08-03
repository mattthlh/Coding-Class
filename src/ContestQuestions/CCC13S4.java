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
    static boolean found;
    static int target;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = in.readLine();

        n = Integer.parseInt(firstLine.split(" ")[0]);
        m = Integer.parseInt(firstLine.split(" ")[1]);

        adj = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for(int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++) {
            String[] nextMLines = in.readLine().split(" ");
            int x = Integer.parseInt(nextMLines[0]);
            int y = Integer.parseInt(nextMLines[1]);

            adj[x].add(y);
        }
        String[] lastLine = in.readLine().split(" ");

        int p = Integer.parseInt(lastLine[0]);
        int q = Integer.parseInt(lastLine[1]);

        target = q;
        found = false;
        dfs(p);

        if(found) {
            System.out.println("yes");
            return;
        }

        target = p;
        found = false;
        visited = new boolean[n + 1];
        dfs(q);

        if (found) {
            System.out.println("no");
            return;
        }
        System.out.println("unknown");
    }
    public static void dfs(int current) {
        if(current == target) {
            found = true;
        }
        visited[current] = true;
        for(int to : adj[current]) {
            if(!visited[to]) {
                dfs(to);
            }
        }
    }
}