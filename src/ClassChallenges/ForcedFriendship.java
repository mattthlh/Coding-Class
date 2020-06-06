package ClassChallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ForcedFriendship {

    static Scanner sc = new Scanner(System.in);
    static Map<String, String> friends = new HashMap<>();
    static Map<Boolean, Integer> conditions = new HashMap<>();
    static int count = 0;
    static boolean oof = true;

    public static void main(String[] args) {
        int length = sc.nextInt();

        for(int i = 0; i < length; i++) {
            String assaignment = sc.nextLine();
            String[] idks = assaignment.split(" ");
            String a = idks[0];
            String b = idks[1];

            friends.put(a, b);
        }

        String condition = sc.nextLine();

        while(!condition.equalsIgnoreCase("0 0")) {
            String[] stuff = condition.split(" ");
            String a = stuff[0];
            String b = stuff[1];

            String key = a;
            String value = friends.get(a);

            while(oof) {
                if(friends.get(key).equalsIgnoreCase(b)) {
                    conditions.put(true, count);
                    oof = false;
                } else if(friends.get(key).equalsIgnoreCase(value)) {
                    conditions.put(false, null);
                    oof = false;
                }
                else {
                    if(friends.containsKey(friends.get(key))) {
                        key = friends.get(key);
                        count++;
                    } else {
                        conditions.put(false, null);
                        oof = false;
                    }
                }
            }

            condition = sc.nextLine();
            count = 0;
            oof = true;
        }

        for (Map.Entry mapElement : conditions.entrySet()) {
            boolean key = (boolean)mapElement.getKey();

            int value = ((int)mapElement.getValue());

            if(key) {
                System.out.println("Yes " + value);
            } else {
                System.out.println("No");
            }
        }
    }
}
