import java.util.Scanner;
import java.util.*;

public class LakeGenevaCandy {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String args[]) {

        int n = new Scanner(System.in).nextInt();
        for(int i = 1; i <= n; i++) {
            stack.push(i);
        }

        System.out.println(stack);

    }
}
