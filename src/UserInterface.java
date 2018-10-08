import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable{

    private JFrame frame;

    public UserInterface(){

    }

    @Override
    public void run() {
        frame = new JFrame("Guessing Game");
        frame.setPreferredSize(new Dimension(320, 100));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container){
        BoxLayout experimentLayout = new BoxLayout(container, BoxLayout.PAGE_AXIS);
        container.setLayout(experimentLayout);

        // Question
        JLabel mainQuestion = new JLabel("Guess a number:");

        // TextField
        JTextField textField = new JTextField();

        // submit
        JButton button = new JButton("Submit");

        //guess answers
        JLabel label = new JLabel(" ");

        // add components
        container.add(createPanel(mainQuestion, textField));
        container.add(button);
        container.add(label);


        button.addActionListener(new SubmitListener(textField, label));
    }

    private JPanel createPanel(JLabel mainQuestion, JTextField textField) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(mainQuestion);
        panel.add(textField);
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
