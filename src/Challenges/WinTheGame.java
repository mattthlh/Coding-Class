package Challenges;


import java.util.Scanner;

class WinTheGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        float[] list = new float[t];
        for(int i = 0; i < t; i++) {
            String first = sc.next();
            String last = sc.next();
            float a = Integer.parseInt(first);
            float b = Integer.parseInt(last);
            System.out.println(a);
            System.out.println(b);
            list[i] = a / (a + b);
            System.out.println(list[i]);
        }
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}