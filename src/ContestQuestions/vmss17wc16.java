package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class vmss17wc16 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer>[] adj;
    static boolean answer = false;
    static boolean[] vist;
    static int n;
    static int m;
    static int a;
    static int b;
    public static void main(String[] args) throws IOException {
        String firstLine = in.readLine();
        String[] numInFirstLine = firstLine.split(" ");
        n = Integer.parseInt(numInFirstLine[0]);
        m = Integer.parseInt(numInFirstLine[1]);
        a = Integer.parseInt(numInFirstLine[2]);
        b = Integer.parseInt(numInFirstLine[3]);
        adj = new ArrayList[n + 1];
        vist = new boolean[n + 1];
        for(int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++){

            String[] tokens = in.readLine().split(" ");

            int x = Integer.parseInt(tokens[0]);
            int y = Integer.parseInt(tokens[1]);
            adj[x].add(y);
            adj[y].add(x);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(a);
        vist[a] = true;

        // BFS solution
        while(!queue.isEmpty()) {
            int current = queue.poll();
            if(current == b) {
                System.out.println("GO SHAHIR!");
                return;
            }
            for(int neighbor : adj[current]) {
                if(!vist[neighbor]) {
                    vist[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println("NO SHAHIR!");
    }

    // DFS Solution
    public static void dfs(int current) {
        vist[current] = true;

        if(current == b) {
            answer = true;
        }
        for(int neighbors : adj[current]) {
            if(!vist[neighbors]) {
                dfs(neighbors);
            }
        }
    }
}
