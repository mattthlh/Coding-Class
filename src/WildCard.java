import java.util.*;

public class WildCard {

    public static void main(String args[]) {
        Stack<Character> stack = new Stack<>();

        String pattern = "1?11?00?1?";

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        //System.out.println(pattern.replace("?", "1"));
    }
}
