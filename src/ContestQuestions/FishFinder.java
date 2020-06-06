package ContestQuestions;

import java.util.Scanner;

public class FishFinder {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a < b && b < c && c < d) {
            System.out.println("Fish Rising");
        } else if(a > b && b > c && c > d) {
            System.out.println("Fish Diving");
        } else if(a == b && b == c && c == d) {
            System.out.println("Fish At Constant Depth");
        } else{
            System.out.println("No Fish");
        }
    }
}