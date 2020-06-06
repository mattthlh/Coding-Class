package OfficialCCC2020;

import java.util.Scanner;

public class J1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int total = s + 2*m + 3*l;
        if(total >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
