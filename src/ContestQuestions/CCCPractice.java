package ContestQuestions;

import java.util.Scanner;

public class CCCPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = Integer.parseInt(sc.nextLine());
        String[] outputs = new String[numLines];

        for (int n = 0; n < numLines; n++) {
            String input = sc.nextLine() + " ";

            String currChar = "";
            String output = "";
            int count = 1;

            for (int i = 0; i < input.length(); i++) {
                String character = Character.toString(input.charAt(i));

                if (currChar.isEmpty()) {
                    currChar = character;
                } else if (character.equals(currChar)) {
                    count++;
                } else {
                    output += count + " " + currChar + " ";
                    currChar = character;
                    count = 1;
                }
            }

            outputs[n] = output;
        }

        for (int i = 0; i < outputs.length; i++) {
            System.out.println(outputs[i]);
        }
    }
}