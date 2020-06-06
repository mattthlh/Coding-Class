package ContestQuestions;

import java.util.Scanner;

public class FamilySequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt(),m = sc.nextInt();

        System.out.println(m - y + m);
    }
}