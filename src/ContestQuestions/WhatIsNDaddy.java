package ContestQuestions;

import java.util.Scanner;

public class WhatIsNDaddy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 5) {
            n /= 2;
            n++;
            System.out.println(n);
        } else if(n == 6) {
            System.out.println(3);
        } else if(n == 7 || n == 8) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}
