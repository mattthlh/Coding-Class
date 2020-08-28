package ContestQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ACoinProblem {

    static int v;
    static Scanner sc;
    static int[] coinType;
    static int[] transactions;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        String[] tokens = sc.nextLine().split(" ");

        int n = Integer.parseInt(tokens[0]);
        v = Integer.parseInt(tokens[1]);
        coinType = new int[n];
        transactions = new int[v];

        tokens = sc.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            coinType[i] = Integer.parseInt(tokens[i]);
        }

        int amount;
        int count;
        int[] temp;
        for (int i = 0; i < v; i++) {
            tokens = sc.nextLine().split(" ");

            amount = Integer.parseInt(tokens[0]);
            int coinsAllowed = Integer.parseInt(tokens[1]);
            count = 0;
            temp = new int[coinsAllowed];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = coinType[j];
            }
            Arrays.sort(temp);
            int anotherCount = temp.length - 1;
            transactions[i] = rec(amount, temp, count, anotherCount);
        }

        for (int i = 0; i < transactions.length; i++) {
            System.out.println(transactions[i]);
        }
    }

    public static int rec(int amount, int[] temp, int count, int anotherCount) {
        if (anotherCount == 0) {
            if (amount != 0) {
                return -1;
            } else {
                return count;
            }
        }

        if (amount - temp[anotherCount] >= 0) {
            amount -= temp[anotherCount];
            count++;

            return rec(amount, temp, count, anotherCount);
        } else {
            anotherCount--;

            return rec(amount, temp, count, anotherCount);
        }
    }
}
