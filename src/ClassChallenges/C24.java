package ClassChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class C24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String idk = sc.nextLine();
        int t = sc.nextInt();
        int[] array = new int[t];

        Arrays.fill(array, 0);

        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 32) {
                    System.out.println(j);
                    array[i] = j + 1;
                    j = line.length();
                }
            }
        }

        for(int num: array) {
            System.out.println(num);
        }
    }
}
