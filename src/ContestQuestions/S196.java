package ContestQuestions;

import java.util.Scanner;

public class S196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++) {

            int number = sc.nextInt();

            for(int j = 1; j * j <= number; j++) {

                if(number % j == 0) {
                    count += j;
                }
                count += number/j;
            }
            if(count < number) {
                System.out.println(number + " is a deficient number.");
            } else if(count == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is an abundant number.");
            }
        }
    }
}
