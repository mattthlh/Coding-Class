package ContestQuestions;

import java.util.Scanner;

public class J3YearStuff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer year = sc.nextInt();

        int count = 1;

        boolean a = true;

        while (a) {
            count = 0;
            year++;

            String newYear = year.toString();

            for(Integer i = 0; i < 10; i++) {

                String strI = i.toString();

                int n = newYear.compareTo(strI);
                if(n > 1) {
                    a = true;
                    count++;
                } else {
                    if(count == 0) {
                        a = false;
                    }
                }
            }
        }
    }
}
