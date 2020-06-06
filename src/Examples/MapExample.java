package Examples;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> mapHttpErrors = new HashMap<>();
        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(404, "Not Found");
        mapHttpErrors.put(500, "Internal Server Error");

        System.out.println(mapHttpErrors);

        Map<String, String> mapContacts = new LinkedHashMap<>();

        mapContacts.put("0169238176", "Tom");
        mapContacts.put("0918238762", "Peter");
        mapContacts.put("1231239384", "Mary");
        mapContacts.put("1982371282", "John");

        System.out.println(mapContacts);

        Map<String, String> mapLang = new TreeMap<>();

        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");

        System.out.println(mapLang);
    }
}