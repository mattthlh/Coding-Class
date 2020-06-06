package ClassChallenges;

import java.util.Scanner;

public class FionaCommutes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();
        String a = time.split(":")[0];
        String b = time.split(":")[1];
        int hour = Integer.parseInt(a);
        int min = Integer.parseInt(b);

        int distance = 2;
        double speed = 1;

        while(distance != 0) {
            if (hour == 7|| hour == 8 || hour == 9|| hour == 15 ||
                    hour == 16|| hour == 17
                    || hour == 18|| hour == 19) {

                speed /= 2;
                hour += 1/speed;
                distance--;

            } else {
                speed = 1;
                hour++;
                distance--;
            }
        }
        if(hour > 10 && min > 0) {
            System.out.println(hour + ":" + min + "0");
        } else if(hour > 10 && min == 0) {
            System.out.println(hour + ":" + min + "0");
        } else if(hour < 10 && min == 0){
            System.out.println("0" + hour + ":" + min + "0");
        } else {
            System.out.println("0" + hour + ":" + min);
        }
    }
}
