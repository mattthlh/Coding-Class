package ClassChallenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class KSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String line1 = line.split(", ")[0];
        String line2 = line.split(", ")[1];
        int k = Integer.parseInt(line2);

        char[] chars = line1.toCharArray();

        for(int i = 0; i < k; i++) {
            if(inOrder(chars)) {
                i = k;
            } else {
                char smallest = findSmallest(chars);
                char filler;
                filler = chars[0];
            }
        }
        System.out.println(chars);
    }

    public static boolean inOrder(char[] chars) {
        for(int i = 0; i < chars.length; i++) {
            for(int j = i; j < chars.length - 1; j++) {
                if(chars[i] >= chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static char findSmallest(char[] chars) {
        char smallest = chars[0];
        for(int i = 1; i < chars.length; i++) {
            if(chars[i] < chars[smallest]) {
                smallest = chars[i];
            }
        }
        return smallest;
    }
}
