package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class VMSS15p4 {
    public static class Edge {
        public int target, length;

        public Edge(int t, int l){
            this.target = t;
            this.length = l;
        }
    }
    static ArrayList<Edge>[] adj;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = in.readLine().split(" ");

        int t = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[1]);
        int m = Integer.parseInt(firstLine[2]);
        int g = Integer.parseInt(firstLine[3]);

        adj = new ArrayList[n + 1];
        dist = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        int[] foodBasics = new int[g];

        for (int i = 0; i < g; i++) {
//            int foodB = Integer.parseInt(in.readLine());
            foodBasics[i] = Integer.parseInt(in.readLine());
//            System.out.println(foodB);
        }

        for (int i = 0; i < m; i++) {
            String[] tokens = in.readLine().split(" ");
            int house1 = Integer.parseInt(tokens[0]);
            int house2 = Integer.parseInt(tokens[1]);
            int length = Integer.parseInt(tokens[2]);

            adj[house1].add(new Edge(house2, length));
        }
        dist[0] = 0;
        for(int i = 1; i < dist.length; i++) {
            dist[i] = 1000 * 100 + 1;
        }

        for(int node = 0; node <= n; node++) {
            for(Edge edge : adj[node]) {
                int target = edge.target;
                int length = edge.length;

                int newLength = dist[node] + length;
                if(newLength < dist[target]) {
                    if(newLength <= t ) { 
                        dist[target] = dist[node] + length;
                    }
                }
            }
        }
        int count = 0;
        for(int node : foodBasics) {
            if(dist[node] <= t) {
//                System.out.println(dist[node]);
//                System.out.println("node: " + node);
                count++;
            }
        }
        System.out.println(count);
    }
}
