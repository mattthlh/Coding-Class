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
    }



    public JFrame getFrame() {
        return frame;
    }
}
