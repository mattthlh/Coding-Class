package ContestQuestions;

import java.util.Scanner;

public class CCC2020J4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String s = sc.nextLine();
        String startS = s;

        if(text.contains(s)) {
            System.out.println("yes");
            return;
        }
        char temp = s.charAt(0);
        s = s.substring(1);
        s = s + temp;

        while (!startS.equals(s)) {
            if (text.contains(s)) {
                System.out.println("yes");
                return;
            }
            temp = s.charAt(0);
            s = s.substring(1);
            s = s + temp;
        }
        System.out.println("no");
    }
}
