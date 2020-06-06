package ClassChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; list.size() < n; i++) {
            for (int j = 1; j < i; j++) {
                if (i/j % i == 0) {
                    list.add(i);
                }
            }
        }

        while(list.size() != 0) {
            for (int i = 0; i < 10; i++) {
                if(list.size() != 0) {
                    System.out.print(list.get(0) + " ");
                    list.remove(0);
                }
            }
        }
    }
}
