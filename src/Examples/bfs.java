package Examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {

    public static ArrayList<Integer>[] adj;
    public static int n, m;

    public static void bfs(int s, int e) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n + 1];
        vis[s] = true; q.add(s);
    }
}
