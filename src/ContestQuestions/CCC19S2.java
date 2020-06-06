package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC19S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int[] means = new int[t];

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(in.readLine());
            means[i] = n;
        }

        for(int i = 0; i < means.length; i++) {
            for(int j = 2; j < means[j]; i++) {
                if(isPrime(j)) {
                    list.add(j);
                }
            }

            for(int m = 0; m < list.size(); m++) {
                int a = list.get(i);
                int b = means[i];

                while (!isPrime(b)) {
                    b++;
                }
                while (a + b < means[i] * 2) {
                    while (!isPrime(b)) {
                        b++;
                    }
                }
                if (a + b < means[i] * 2) {
                    System.out.println(a + " " + b);
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
