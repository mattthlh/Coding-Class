import java.util.Scanner;

public class AlphabetStairs {

    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char beginningLetter = sc.nextLine().charAt(0);
        char endingLetter = sc.nextLine().charAt(0);

        int end = alphabet.indexOf(endingLetter);

        for(int i = 0; i <= end; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print(alphabet.charAt(i));
            }
            System.out.println();
        }
    }
}
