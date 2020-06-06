import java.util.Scanner;

public class PermuationAndCombinationCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number : ");
        int n = sc.nextInt();

        System.out.println("Number of picks: ");
        int r = sc.nextInt();

        int numerator = factorial(n);
        int denominator = factorial(n-r);

        System.out.println("Permutation");
            System.out.println(numerator/denominator);

        int numerator1 = factorial(n);
        int denominator1 = factorial(n-r);
        denominator1 = denominator1 * factorial(r);

        System.out.println("combination");
        System.out.println(numerator1/denominator1);
    }

    private  static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}
