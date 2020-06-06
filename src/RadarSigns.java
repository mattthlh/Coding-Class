import java.util.Scanner;

public class RadarSigns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the speed limit: ");
        int speedLimit = sc.nextInt();

        System.out.println("Enter the recorded speed of car: ");

        int carSpeed = sc.nextInt();

        if(carSpeed < speedLimit) {
            System.out.println("Congratualtions, you are within the speed limit1");
        } else if(carSpeed <= speedLimit + 20) {
            System.out.println("You are speeding and your fine is $100.");
        } else if (carSpeed <= speedLimit + 30) {
            System.out.println("You are speeding and your fine is $270.");
        } else {
            System.out.println("You are speeding and your fine is $500.");
        }
    }
}
