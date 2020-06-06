package Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapForEach {

    public static void main(String[] args) {

        HashMap<String, Integer> hm =
                new HashMap<String, Integer>();

        hm.put("Canada", 1);
        hm.put("Youth", 2);
        hm.put("Robotics", 3);
        hm.put("Club", 4);

        System.out.println("Hashmap is: \n" + hm);

        Iterator hmIterator = hm.entrySet().iterator();

        System.out.println("HashMap after adding: ");

        hm.forEach((k, v) -> System.out.println(k + " : " + (v + 10)));
    }
}
