package ContestQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsJ4 {
    public static void main(String[] args) {
        boolean oof = true;
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line2 = sc.nextLine();

        if(line2.contains("*")) {

            char[] chars1 = line.toCharArray();
            char[] chars2 = line2.toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);

            for(int i = 0; i < line.length(); i++) {
                if(chars1[i] != chars2[i] && chars2[i] != '*') {
                    oof = false;
                }
            }
        } else {
            char[] chars1 = line.toCharArray();
            char[] chars2 = line2.toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);

            for(int i = 0; i < line.length(); i++) {
                if(chars1[i] != chars2[i]) {
                    oof = false;
                }
            }
        }
        if(oof) {
            System.out.println("A");
        } else {
            System.out.println("N");
        }
    }
}
