package ContestQuestions;

import java.util.Scanner;

public class DMOPC14C2P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sumArray = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            sumArray[i] = sumArray[i - 1] + sc.nextInt();
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt() + 1;

            System.out.println(sumArray[b] - sumArray[a]);
        }
    }
}
