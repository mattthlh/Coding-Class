package ContestQuestions;

import java.util.Scanner;

public class CCC2020J3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int smallX = 100;
        int smallY = 100;
        int bigX = 0;
        int bigY = 0;

        String filler = sc.nextLine();
        for(int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split(",");

            int currentX = Integer.parseInt(tokens[0]);
            int currentY = Integer.parseInt(tokens[1]);

            if(currentX > bigX) {
                bigX = currentX;
            }
            if(currentX < smallX) {
                smallX = currentX;
            }

            if(currentY > bigY) {
                bigY = currentY;
            }
            if(currentY < smallY) {
                smallY = currentY;
            }
        }
        smallX -= 1;
        smallY -= 1;
        bigX += 1;
        bigY += 1;

        System.out.println(smallX + "," + smallY);
        System.out.println(bigX + "," + bigY);
    }
}