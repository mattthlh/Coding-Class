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
        //New texts and buttons here
        container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
        JLabel mainQuestion = new JLabel("Are you satisfied with our service?");
        JLabel why = new JLabel("Why?");
        JRadioButton yesButton = new JRadioButton("Yes");
        JRadioButton noButton = new JRadioButton("No");
        JButton button = new JButton("Submit");
        JTextField textField = new JTextField();
        ButtonGroup buttonGroup = new ButtonGroup();
        //adds buttons to a group
        buttonGroup.add(yesButton);
        buttonGroup.add(noButton);
        //adds texts and buttons to frame
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
