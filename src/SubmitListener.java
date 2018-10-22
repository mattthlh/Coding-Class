import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitListener implements ActionListener {

    private JButton button = new JButton();

    public SubmitListener(JButton button) {
        this.button = button;
    }

    // every ActionListener has to implement this method
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

