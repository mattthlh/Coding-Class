package ContestQuestions;

import java.util.Scanner;
import java.util.Stack;

public class CCC14S3 {

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();

        boolean[] isPossible = new boolean[t];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] trucks = input(n);
            isPossible[i] = canDeliver(trucks, n, i, isPossible);
        }

        for (boolean a : isPossible) {
            if (a) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }


    public static int[] input(int n) {
        int[] trucks = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            trucks[i] = sc.nextInt();
        }
        return trucks;
    }

    public static boolean canDeliver(int[] trucks, int n, int i, boolean[] isPossible) {
        int count = 1;
        isPossible[i] = true;
        Stack<Integer> mountainSide = new Stack<>();
        mountainSide.push(n + 1);

        for(int j = 0; j < n; j++) {
            int currentTruck = trucks[j];
            if(currentTruck == count) {
                count++;
            } else {
                if(currentTruck < mountainSide.peek()) {
                    mountainSide.push(currentTruck);
                } else {
                    if(mountainSide.peek() == count) {
                        mountainSide.pop();
                        count++;
                        j--;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
