package OfficialCCC2020;

import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String string = sc.nextLine();
        boolean condition = true;
        String end = string;
        char filler;

        while(condition) {
            if(text.contains(string)) {
                System.out.println("yes");
                condition = false;
            } else {
                filler = string.charAt(0);
                string = string.substring(1);
                string = string + filler;
            }
            if(string.equalsIgnoreCase(end) && condition) {
                System.out.println("no");
                condition = false;
            }
        }
    }
}
