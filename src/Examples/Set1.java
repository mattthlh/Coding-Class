package Examples;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

    public static void main(String[] args) {
        int count[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<Integer>();
        try {
            for (int i = 0; i < 5; i++) {
                set.add(count[i]);
            }
            System.out.println(set);

        } catch(Exception e) {

        }
    }
}
