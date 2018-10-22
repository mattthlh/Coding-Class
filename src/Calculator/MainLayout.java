package Calculator;

import javax.swing.*;
import java.awt.*;

public class MainLayout extends JPanel {

    GridBagConstraints c = new GridBagConstraints();

    public MainLayout() {
        setLayout(new GridBagLayout());
        drawComponents();
    }

    private void drawComponents() {

        JTextField numberBox = new JTextField();

        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");
        JButton divide = new JButton("/");

        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton multiply = new JButton("*");


        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton minus = new JButton("-");

        JButton num0 = new JButton("0");
        JButton dot = new JButton(".");
        JButton plus = new JButton("+");
        JButton equals = new JButton("=");

        JButton[] buttons = {num7, num8, num9, divide,
                num4, num5 , num6 , multiply,
                num1, num2, num3, minus,
                num0, dot, equals, plus};

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0;
        c.ipady = 20;
        c.gridwidth = 4;
        c.gridy = 0;

        add(numberBox, c);

        for(int i = 0; i < buttons.length; i++){
            int row = i / 4;
            int column = i % 4;
            c.fill = GridBagConstraints.HORIZONTAL;
            c.weightx = 0.5;
            c.gridwidth = 1;
            c.ipady = 30;
            c.ipadx = 20;
            c.gridx = column;
            c.gridy = row + 1;
            buttons[i].addActionListener(new ButtonListener(buttons[i], numberBox));
            add(buttons[i], c);
        }
    }
}
