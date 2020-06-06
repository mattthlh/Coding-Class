package OfficialCCC2020;

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int oldInfected = 0;
        int day = 0;

        while(n + oldInfected <= p) {
            oldInfected += n;
            n *= r;
            day++;
        }
        System.out.println(day);
    }
}