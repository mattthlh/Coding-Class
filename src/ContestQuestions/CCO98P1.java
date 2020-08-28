package ContestQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class CCO98P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> answers = new ArrayList<>();

        while(true) {
            int n = sc.nextInt();

            if(n != 0) {
                answers.add(dpFib(n));
            } else {
                break;
            }
        }
        for (long answer : answers) {
            System.out.println(answer);
        }
    }

    public static long dpFib(int n) {
        long[] fib = new long[n + 2];

        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i <=n; i++) {
            fib[i] = fib[i-1] + fib[i - 2];
        }
        return fib[n];
    }
}
