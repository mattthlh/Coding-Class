package ClassChallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MaximumTimeFormed {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int count = 0;
        Map<Integer, String> map = new TreeMap<>();
        for(int o : arr) {
            map.put(o, "a");
        }

        if(!map.containsKey(0) || !map.containsKey(1) || !map.containsKey(2)) {
            System.out.println(-1);
            count = 1;
        }

        for(int o : arr) {
            if(o == 2) {
                arr[0] = o;
                map.remove(o);
            }
        }
        for(int o : arr) {
            if(o == 1) {
                arr[0] = o;
                map.remove(o);
            }
        }
        for(int o : arr) {
            if(o == 0) {
                arr[0] = o;
                map.remove(o);
            }
        }


    }
}
