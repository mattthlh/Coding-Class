import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SubmitListener implements ActionListener {

    private JTextField textField;
    private JLabel label;
    Random rand = new Random();
    private int random = rand.nextInt(101);

    public SubmitListener(JTextField textField, JLabel label) {
        this.textField = textField;
        this.label = label;
    }

    // every ActionListener has to implement this method
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        int textFieldNum = Integer.parseInt(text);
        if(textFieldNum < random){
            label.setText("Guess is too low");
        } else if(textFieldNum > random){
            label.setText("Guess is too high");
        } else {
            label.setText("You guessed the number");
        }
    }
}

