package ContestQuestions;

import java.util.Scanner;

public class CCC13J2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char[] validChars = {'I', 'O', 'S', 'H', 'Z', 'X', 'N'};

        for (int i = 0; i < word.length(); i++) {
            boolean isRotatable = false;
            for (char validChar : validChars) {
                if (word.charAt(i) == validChar) {
                    isRotatable = true;
                    break;
                }
            }
            if(!isRotatable) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
