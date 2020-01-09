package Examples;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ASpinnerExample extends JFrame implements ActionListener {

    public JButton OKButton;
    JSpinner hours;
    JSpinner minutes;
    JSpinner seconds;
    JSpinner ampm;
    JLabel label1;

    public static void main(String[] args) {
        new ASpinnerExample();
    }

    public ASpinnerExample() {
        OKButton = new JButton("OK");
        OKButton.addActionListener(this);
        JPanel panel1 = new JPanel();
        label1 = new JLabel();
        hours = new JSpinner(new SpinnerNumberModel(1, 1,
                12, 1));
        minutes = new JSpinner(new SpinnerNumberModel(1, 0,
                59, 1));
        seconds = new JSpinner(new SpinnerNumberModel(1, 0,
                59, 1));

        String[] ampmString = {"am" , "pm"};
        ampm = new JSpinner(new SpinnerListModel(ampmString));
        panel1.add(hours);
        panel1.add(minutes);
        panel1.add(seconds);
        panel1.add(ampm);
        panel1.add(label1);
        panel1.add(OKButton);
        this.add(panel1);
        this.setSize(400, 150);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == OKButton) {
            int hours1 = (int) hours.getValue();
            int minutes1 = (int) minutes.getValue();
            int seconds1 = (int) seconds.getValue();
            String ampm1 = (String) ampm.getValue();

            label1.setText("Your set this time = Hour: " + hours1 + " minutes "
                    + minutes1 + " seconds " + ":"  + ampm1);
        }
    }
}
