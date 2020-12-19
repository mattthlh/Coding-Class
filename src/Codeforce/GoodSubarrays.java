package Codeforce;

import java.util.Scanner;

public class GoodSubarrays {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(solve());
        }
    }

    private static int solve() {
        int n = sc.nextInt();
        int[] array = new int[n + 1];
        int[] sumArray = new int[n + 1];
        int count = 0;

        int input = sc.nextInt();
        for (int i = array.length - 1; i > 0; i--) {
            int num = input % 10;
            array[i] = num;
            input /= 10;
        }

        for (int i = 1; i < sumArray.length; i++) {
            sumArray[i] = sumArray[i - 1] + array[i];
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                int num = sumArray[i] - sumArray[j];
                int size = i - j;

                if(num == size) count++;
            }
        }
        return count;
    }
}
