package Codeforce;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EasyArithmetic {
    static Scanner input;
    public static void main (String[]args) throws IOException {
        try {
            input = new Scanner(new File("easy.in"));
        } catch (Exception e) {
            System.out.println(e);
        }

        String sequence = input.nextLine();
        StringBuffer str = new StringBuffer(sequence);
        if(sequence.contains("-")) {
            int num = sequence.indexOf("-");
            System.out.println(num);

            if(sequence.charAt(num + 2) != '-' || sequence.charAt(num + 2) != '+') {
                str.insert(num+2, '+');
            }
        } else {
            filewriter(sequence);
        }
        filewriter(sequence);
    }

    public static void filewriter (String string) throws IOException {
        BufferedWriter writer = new BufferedWriter
                (new FileWriter("easy.out", true));
        writer.newLine();
        writer.append(string);

        writer.close();
    }
}