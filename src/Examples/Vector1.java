package Examples;

import java.util.List;
import java.util.Vector;

public class Vector1 {

    public static void main(String[] args ) {

        Vector v = new Vector();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add("Vector");
        v.add("Example");

        System.out.println("Vector is " + v);

        Vector<String> vct = new Vector<String>();

        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        vct.add("Click");
        System.out.println("Actual vector:" + vct);
        List<String> list = vct.subList(2, 4);
        System.out.println("Sub List: " + list);
    }
}
