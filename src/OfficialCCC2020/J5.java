package OfficialCCC2020;

import java.util.ArrayList;
import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] cell = new int[m][n];
        sc.nextLine();

        for(int i = 0; i < m; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < n; j++) {
                cell[i][j] = Integer.parseInt(line.split(" ")[j]);
            }
        }
        int start = cell[0][0];
        int oof = 0;

        if(canEscape(start, m, n, cell, 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean canEscape(int start, int m , int n, int[][]cell, int oof) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        if (start == cell[m - 1][n - 1]) {
            return true;
        }

        int count = 0;
        for (int i = 1; i <= start; i++) {
            if (start % i == 0 && cell[0][0] != 1) {
                x.add(i);
                y.add(start / i);
                count++;
            }
        }

        if(oof > 1000) {
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (x.get(i) - 1 < m && y.get(i) - 1 < n) {
                oof++;
                if (canEscape(cell[x.get(i) - 1][y.get(i) - 1], m, n, cell, oof)) {
                    return true;
                }
            }
        }
        return false;
    }
}
