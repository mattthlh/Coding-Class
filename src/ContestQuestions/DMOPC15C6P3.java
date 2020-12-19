package ContestQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DMOPC15C6P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextInt();
        int[][] field = new int[n + 1][m + 1];
        int[][] subArray = new int[n + 1][m + 1];

        for (int i = 1; i < field.length; i++) {
            Arrays.fill(field[i], 1);
        }

        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b ; j++) {
                field[j][i] = 0;
            }
        }

        for (int i = 1; i < subArray.length; i++) {
            for (int j = 1; j < subArray[0].length; j++) {
                subArray[i][j] = subArray[i][j - 1] + field[i][j];
            }
        }

//        for (int i = 1; i < field.length; i++) {
//            for (int j = 1; j < field[0].length; j++) {
//                if(field[i][j] == 1) {
//                    System.out.print("P");
//                } else {
//                    System.out.print(".");
//                }
//            }
//            System.out.println();
//        }

//        for (int i = 1; i < subArray[0].length; i++) {
//            System.out.println("sum: " + subArray[i][subArray[0].length - 1]);
//        }
        int[] array = new int[field.length];

        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + subArray[i][subArray[0].length - 1];
        }

        System.out.println(solve(field, k, array));
    }

    public static int solve(int[][] field, long target, int[] subArray) {
        int best = 999999;
        for (int i = 1; i < field.length; i++) {
            for (int j = 0; j < i; j++) {
                long num = subArray[i] - subArray[j];
                if(num >= target)
                    best = Math.min(best, i - j);
            }
        }
        if(best < 999999) {
            return best;
        } else {
            return -1;
        }
    }
}
