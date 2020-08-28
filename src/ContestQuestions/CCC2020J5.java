package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class CCC2020J5 {

    static BufferedReader in;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(in.readLine());
        int col = Integer.parseInt(in.readLine());
        int[][] room = new int[row + 1][col + 1];
        visit = new boolean[row + 1][col + 1];

        for(int i = 1; i <= row; i++) {
            String[] line = in.readLine().split(" ");
            for(int j = 1; j <= col; j++) {
                room[i][j] = Integer.parseInt(line[j - 1]);
            }
        }
        Stack<Integer> nextProcesses = new Stack<>();
        nextProcesses.push(room[1][1]);
        visit[1][1] = true;
        ArrayList<Integer> factors;
        while(!nextProcesses.isEmpty()) {
            int current = nextProcesses.pop();
            factors = findFactors(current);

            for (int factor1 : factors) {
                int factor2 = current / factor1;

//                System.out.println(current);
//                System.out.println(factor1);
//                System.out.println(factor2);
//                System.out.println("===================");

                if (factor1 == row && factor2 == col) {
                    System.out.println("yes");
                    return;
                }
                if (factor2 == row && factor1 == col) {
                    System.out.println("yes");
                    return;
                }

                if (factor1 <= row && factor2 <= col) {
                    if (!visit[factor1][factor2]) {
                        nextProcesses.push(room[factor1][factor2]);
                        visit[factor1][factor2] = true;
                    }
                }
                if (factor2 <= row && factor1 <= col) {
                    if (!visit[factor2][factor1]) {
                        nextProcesses.push(room[factor2][factor1]);
                        visit[factor2][factor1] = true;
                    }
                }
            }
        }

        System.out.println("no");
    }

    public static ArrayList<Integer> findFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}