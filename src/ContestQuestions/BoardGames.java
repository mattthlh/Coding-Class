package ContestQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BoardGames {

    static int n;
    static int m;
    static int front;
    static int back;
    static final int max =  10 * 1000 * 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        front = 0;
        back = 0;

        boolean[] visited = new boolean[max];
        int[] distance = new int[10 * 1000 * 1000];

        queue.add(n);

        while(true) {
            int current = queue.poll();
            if(current == m) {
                System.out.println(distance[current]);
                return;
            }

            if (3 * current <= max && !visited[3*n]) {
                visited[3*current] = true;
                queue.offer(3 * current);
                distance[3 * current] = distance[current] + 1;
            }
            if (current - 1 > 0 && !visited[current - 1]) {
                visited[current - 1] = true;
                queue.offer(current - 1);
                distance[current - 1] = distance[current] + 1;
            }
            if (current - 3 > 0 && !visited[current - 3]) {
                visited[current - 3] = true;
                queue.offer(current - 3);
                distance[current - 3] = distance[current] + 1;
            }
            if (current % 2 == 0 && !visited[current/2]) {
                visited[current / 2] = true;
                queue.offer(current / 2);
                distance[current/2] = distance[current] + 1;
            }
        }
    }
}