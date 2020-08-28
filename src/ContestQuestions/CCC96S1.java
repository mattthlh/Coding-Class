package ContestQuestions;

import java.util.Scanner;

public class CCC96S1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] finalAnswer = new String[n];

        for(int i = 0; i < n; i++) {
            int chosenNum = sc.nextInt();
            int count = 0;

            for(int j = 1; j <= chosenNum/2; j++) {
                if(chosenNum%j == 0) {
                    count += j;
                }
            }

            if(count == chosenNum) {
                finalAnswer[i] = chosenNum + " is a perfect number.";
            } else if(count < chosenNum){
                finalAnswer[i] = chosenNum + " is a deficient number.";
            } else {
                finalAnswer[i] = chosenNum + " is an abundant number.";
            }
        }

        for (String answer : finalAnswer) {
            System.out.println(answer);
        }
    }
}
