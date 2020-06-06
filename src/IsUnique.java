import java.util.ArrayList;

public class IsUnique {

    static ArrayList<Character> arrayList = new ArrayList<>();

    public static void main(String[] args) {

        String unique = "#254";

        char[] chars = unique.toCharArray();

        for(int n = 0; n < chars.length; n++) {
            if(contains(chars[n])) {
                System.out.println("duplicated");
                break;
            } else {
                arrayList.add(chars[n]);
                System.out.println("added " + chars[n]);
            }
        }
    }

    public static boolean contains(char character) {
        for (int i = 0; i < arrayList.size(); i++) {
            if(character == arrayList.get(i)) {
                return true;
            }
        }
        return false;
    }
}
