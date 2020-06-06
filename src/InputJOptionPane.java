import javax.swing.JOptionPane;
import java.math.BigInteger;

public class InputJOptionPane {

    public static void main(String args[]) {

        String s;
        s = JOptionPane.showInputDialog("Enter an integer:");

        BigInteger bg = new BigInteger(s);

        String binaryX = bg.toString(2);
        String hexX = bg.toString(8);
        String octalX = bg.toString(16);


        JOptionPane.showMessageDialog( null ,"The Binary is: " + binaryX
                + "\nThe Hex is: " + hexX
                + "\nThe Octal is: " + octalX);


    }
}