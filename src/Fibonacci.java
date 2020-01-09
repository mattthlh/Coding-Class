import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String args []) {
        while (true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Please print a number: ");
            int n = sc.nextInt();

            long currTime = System.currentTimeMillis();

            for (int i = 1; i <= n; i++) {
                System.out.println(fibonacciShort(i) + "\t");
            }

            long shortFibRunTime = System.currentTimeMillis() - currTime;
            System.out.println("\n");

            currTime = System.currentTimeMillis();

            for (int i = 1; i <= n; i++) {
                System.out.println(fibonacciLong(i) + "\t");
            }

            System.out.println("Long Fib Took (ms): "
                    + (System.currentTimeMillis() - currTime));
            System.out.println("Short Fib Took (ms): " + shortFibRunTime);
            System.out.println("\n");
        }
    }

    public static int fibonacciShort(int n) {
        int i = 1;
        int j = 1;
        while (n-- >= 0) {
            i += j;
            j = i-j;
        }
        return j;
    }

    public static int fibonacciLong(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacciLong(n - 1) + fibonacciLong(n - 2);
        }
    }
}
