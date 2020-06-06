package ContestQuestions;

import java.util.Scanner;

public class FavouriteTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long minutes = sc.nextInt();
        long maximum;

        if(minutes > 60)
            maximum = 1200 + (minutes%60) + (minutes/60);
        else {
            maximum = 1200 + minutes;
        }

        if(maximum >= 1200) {
            maximum = maximum - (maximum/12) + (maximum%12);
        }
        int n = 1200;

        while(n < maximum) {
        }
    }
}
