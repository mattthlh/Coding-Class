import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        int amountOfNumbers = 7;
        Scanner sc = new Scanner(System.in);

        int[] array = new int[amountOfNumbers];

        // Init Array
        for (int i = 1; i <= amountOfNumbers; i++) {
            System.out.println("Number #" + i + ": ");
            int n = sc.nextInt();
            array[i - 1] = n;
        }

        // Check if even or odd then print
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println(array[i] + " is an even number.");
            } else {
                System.out.println(array[i] + " is an odd number.");
            }
        }
    }
}