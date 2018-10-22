package Calculator;

import javax.swing.*;

public class Main {
    public static void main(String args[]){

        JFrame frame;
        MainLayout layout = new MainLayout();

        frame = new JFrame("Calculator");
        frame.add(layout);

        frame.pack();
        frame.setVisible(true);
    }
}
