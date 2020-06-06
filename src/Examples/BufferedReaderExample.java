package Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int hours;
        double rate, pay;
        System.out.println("Enter your name: ");
        name = in.readLine();
        System.out.println("Enter the number of hours worked: ");
        hours = Integer.parseInt(in.readLine());
        System.out.println("Enter pay rate per hour: ");
        rate = Double.parseDouble(in.readLine());
        System.out.println();
        pay = hours * rate;
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println(name + ", your pay is :" + fmt.format(pay));
    }
}
