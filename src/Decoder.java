import java.util.ArrayList;
import java.util.Scanner;

public class Decoder {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Input parameter K: ");
        int k = sc.nextInt();

        System.out.println("Enter Coded Message: ");
        String secretMess = sc.next();

        for(int i = 1; i <= secretMess.length(); i++) {
            int s = (3*i) + k;
            int letter = secretMess.charAt(i - 1);

            int newLetter = letter + s;
            System.out.println(newLetter);
            newLetter = newLetter % 90;

            list.add(newLetter);
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.print((char)list.indexOf(i));
        }
    }
}
