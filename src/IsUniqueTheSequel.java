import java.util.ArrayList;

public class IsUniqueTheSequel {
    public static void main(String[] args) {
        String str = "#254";
        System.out.println(isCharsUnique(str));
    }

    public static boolean isCharsUnique(String str) {
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if (charSet[ch]) return false;
            charSet[ch] = true;
        }
        return true;
    }
}

