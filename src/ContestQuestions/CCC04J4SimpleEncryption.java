package ContestQuestions;

import java.util.Scanner;

public class CCC04J4SimpleEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keyword = sc.nextLine();

        String text = sc.nextLine();

        char[] chars = text.toCharArray();

        char[] encrypted = new char[text.length()];
        int count = 0;

        for(int i = 0; i < text.length(); i++) {
            int currentChar = text.charAt(i);
            count %= keyword.length();
            if (currentChar >= 'A' && currentChar <= 'Z') {
                int increment = keyword.charAt(count) % 'A';

                int newChar = currentChar + increment;
                if(newChar > 'Z') {
                    newChar -= 26;
                }
                encrypted[i] = (char)newChar;
                count++;
            } else {
                encrypted[i] = 0;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if(encrypted[i] != 0) {
                System.out.print(encrypted[i]);
            }
        }
    }

}
