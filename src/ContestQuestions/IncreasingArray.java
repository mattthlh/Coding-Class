package ContestQuestions;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[i - 1]) {
                int difference = array[i - 1] - array[i];
                array[i] += difference;
                ans += difference;
            }
        }
        System.out.println(ans);
    }
}
