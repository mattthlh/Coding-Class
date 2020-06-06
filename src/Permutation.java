import java.util.ArrayList;
import java.util.Collections;

public class Permutation {

    public static void main(String[] args) {

        String str1 = "cat";
        String str2 = "i12uh ";

        ArrayList<String> list1 = convert(str1);
        ArrayList<String> list2 = convert(str2);

        Collections.sort(list1);
        Collections.sort(list2);

        if(list1.equals(list2)) {
            System.out.println("Is Permutable");
        } else {
            System.out.println("Not A Permutation");
        }
    }

    public static ArrayList<String> convert(String s) {

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            list.add(String.valueOf(s.charAt(i)));
        }

        return list;
    }
}
