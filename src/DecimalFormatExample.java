import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalFormatExample {

    public static void main(String[] args) {
        int radius;

        double area, circuference;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the circle's radius");

        radius = sc.nextInt();

        area = Math.PI * Math.pow(radius, 2);
        circuference = 2 * Math.PI * radius;

        DecimalFormat fmt = new DecimalFormat("0,###");
        System.out.println("The circle's area: " + fmt.format(area));
        System.out.println("The circle's circumference: " +
                fmt.format(circuference));
    }
}
