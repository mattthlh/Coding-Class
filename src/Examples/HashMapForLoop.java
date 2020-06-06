package Examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapForLoop {

    public static void main(String[] args) {

        HashMap<String, Integer> hm =
                new HashMap<String, Integer>();

        hm.put("Canada", 1);
        hm.put("Youth", 2);
        hm.put("Robotics", 3);
        hm.put("Club", 4);

        System.out.println("Hashmap is: \n" + hm);

        System.out.println("HashMap after adding: ");

        for (Map.Entry mapElement : hm.entrySet()) {
            String key = (String)mapElement.getKey();

            int value = ((int)mapElement.getValue() + 10);

            System.out.println(key + " : " + value);

        }
    }
}
