import java.util.Scanner;

public class NumberPyrimid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows: ");
        
        int rows = sc.nextInt();
        int a = 0;
        int count = 0;
        int count1 = 0;
        for(int i = 1; i <= rows; i++) {
            for(int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
                count++;
            }
            while(a != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i + a) + " ");
                    count++;
                }
                else {
                    count1++;
                    System.out.print((i + a - 2 * count1) + " ");
                }
                a++;
            }
            count1 = count = a = 0;
            System.out.println();
        }
    }
}
