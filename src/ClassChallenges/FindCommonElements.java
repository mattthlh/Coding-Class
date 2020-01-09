package ClassChallenges;

import java.util.Set;
import java.util.TreeSet;

public class FindCommonElements {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        TreeSet<String> set1 = new TreeSet<>();

        set.add("c++");
        set.add("python");
        set.add("java");

        set1.add("html");
        set1.add("c++");
        set1.add("java");

        set.descendingSet();
        set1.descendingSet();


        System.out.println(set);
        System.out.println(set1);

        for(int i = 0; i < set.size(); i++) {
            if(set.first().equals(set1.first())) {
                System.out.println(set.first());
            }
            set.remove(set.first());
            set1.remove(set1.first());
        }
    }
}
