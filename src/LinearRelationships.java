import java.util.Scanner;

public class LinearRelationships {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("X is:");
        float x = sc.nextFloat();

        System.out.println("the slope is:");
        float slope = sc.nextFloat();

        System.out.println("the remaining is:");
        float b = sc.nextFloat();

        float y = x*slope;

        y += b;

        System.out.println("Y is: " + y);
    }
}
