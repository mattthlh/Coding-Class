import java.util.Scanner;

public class NoLoopPrinter {

    String args[];
    static int n = 10;
    static int i = 1;

    public static void main(String[] args) {
        if(i > n) {
            return;
        } else {
            System.out.println(i);
            i++;
            main(args);
        }
    }
}
