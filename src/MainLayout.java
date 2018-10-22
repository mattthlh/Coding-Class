import javax.swing.*;
import java.awt.*;

public class MainLayout extends JPanel {

    public MainLayout() {
        JPanel numberPanel = new JPanel(new GridLayout(5, 4));
        drawComponents();
    }

    private void drawComponents() {
        JButton clear = new JButton("AC");
        JButton change = new JButton("+/-");
        JButton percentage = new JButton("%");
        JButton divide = new JButton("/");

        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");
        JButton multiply = new JButton("*");

        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton minus = new JButton("-");

        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton plus = new JButton("+");

        JButton num0 = new JButton("0");
        JButton none = new JButton("");
        JButton dot = new JButton(".");
        JButton equals = new JButton("=");

        JButton[] buttons = {clear, change, percentage, divide,
                             num7, num8, num9, multiply,
                             num4, num5 , num6 , minus,
                             num1, num2, num3, plus,
                             num0, none, dot, equals};

        for(int i = 0;i < buttons.length; i++){
            add(buttons[i]);
        }
    }
    public void thing(JButton button){
        SubmitListener submitListener = new SubmitListener(button);
    }
}
