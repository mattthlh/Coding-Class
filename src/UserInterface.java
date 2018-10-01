import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable{

    private JFrame frame;

    public UserInterface(){

    }

    @Override
    public void run() {
        frame = new JFrame("My application");
        frame.setPreferredSize(new Dimension(400, 200));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container){
        container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

        // satisfaction
        JLabel mainQuestion = new JLabel("Are you satisfied with our service?");
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton yesButton = new JRadioButton("Yes");
        JRadioButton noButton = new JRadioButton("No");
        buttonGroup.add(yesButton);
        buttonGroup.add(noButton);

        // why
        JLabel why = new JLabel("Why?");
        JTextField textField = new JTextField();

        // submit
        JButton button = new JButton("Submit");

        // add components
        container.add(mainQuestion);
        container.add(yesButton);
        container.add(noButton);
        container.add(why);
        container.add(textField);
        container.add(button);
    }

    public JFrame getFrame() {
        return frame;
    }
}
