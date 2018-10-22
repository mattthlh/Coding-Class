import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable{

    private JFrame frame;

    public UserInterface(){

    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(330, 400));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container){

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(new HorizontalLayout());
        panel.add(new MainLayout());

        container.add(panel);

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
        container.add(new HorizontalLayout(mainQuestion, textField));
        container.add(button);
        container.add(label);


        button.addActionListener(new SubmitListener(textField, label));
>>>>>>> origin/master
    }

    public JFrame getFrame() {
        return frame;
    }
}
