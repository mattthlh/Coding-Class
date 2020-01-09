package ClassChallenges;

import java.util.Scanner;

public class ReplaceOccurences {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input a String: ");
        String oof = sc.nextLine();

        System.out.println("Input a Pattern: ");
        String pattern = sc.nextLine();

        System.out.println("Input a Character: ");
        String character = sc.nextLine();

        oof = oof.replace(pattern, character);

        System.out.println(oof);
    }
}
