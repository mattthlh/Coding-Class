package OfficialCCC2020;

import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smallestX = 100;
        int smallestY = 100;
        int largestX = 0;
        int largestY = 0;

        int n = sc.nextInt();
        String line = sc.nextLine();
        for(int i = 0; i < n; i++) {
            line = sc.nextLine();
            String[] array = line.split(",");
            int newX = Integer.parseInt(array[0]);
            int newY = Integer.parseInt(array[1]);
            if(newX < smallestX) {
                smallestX = newX;
            }
            if(newX > largestX) {
                largestX = newX;
            }
            if(newY < smallestY) {
                smallestY = newY;
            }
            if(newY > largestY) {
                largestY = newY;
            }
        }
        smallestY--;
        smallestX--;
        largestX++;
        largestY++;
        System.out.println(smallestX+ "," + smallestY);
        System.out.println(largestX+ "," + largestY);
    }
}
