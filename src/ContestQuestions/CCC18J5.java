package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CCC18J5 {

    static BufferedReader in;
    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        boolean[] visited = new boolean[n + 1];
        int[] distance = new int[n + 1];
        ArrayList<Integer>[] adj = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
            String[] lines = in.readLine().split(" ");
            int m = Integer.parseInt(lines[0]);

            for (int j = 1; j <= m; j++) {
                adj[i].add(Integer.parseInt(lines[j]));
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        while(!queue.isEmpty()) {
            int current = queue.poll();

            for(int to : adj[current]){
                if(!visited[to]) {
                    visited[to] = true;
                    distance[to] = distance[current] + 1;
                    queue.offer(to);
                }
            }
        }

        boolean canReachAll = true;
        for(int i = 1; i <= n; i++){
            if(!visited[i]) {
                canReachAll = false;
            }
        }

        int shortestDist = 10 * 1000 + 1;

        for(int i = 1; i <= n; i++){
            if(visited[i] && adj[i].size() == 0) {
                shortestDist = Math.min(shortestDist, distance[i]);
            }
        }

        if(canReachAll) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        System.out.println(shortestDist + 1);
    }
}