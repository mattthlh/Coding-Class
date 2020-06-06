import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PizzaList extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new PizzaList();
    }
    public JButton buttonOK;
    public JList list1;
    public String[] toppings = {"Pepperoni", "Sausage", "Linguica", "Canadian Bacon", "Salami", "Tuna",
            "Olives", "Mushrooms", "Tomatoes", "Pineapple", "Kiwi", "Gummy Worms"};
    public PizzaList() {

        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        this.setTitle("List Application");
        buttonOK = new JButton("OK");
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Choose: ");
        list1 = new JList(toppings);
        list1.setVisibleRowCount(5);
        JScrollPane scroll = new JScrollPane(list1);
        panel1.add(label1);
        panel1.add(scroll);
        panel1.add(buttonOK);
        buttonOK.addActionListener(this);
        this.add(panel1);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object[] toppings = list1.getSelectedValues();
        String msg = "You selected the following toppings:\n";
        for (Object topping : toppings) {
            msg += (String) topping + "\n";
        }
        JOptionPane.showMessageDialog(list1, msg, "Your Pizza", JOptionPane.INFORMATION_MESSAGE);
        list1.clearSelection();

    }
}

