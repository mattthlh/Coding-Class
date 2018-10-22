import javax.swing.*;
import java.awt.*;

public class DrawingInterface implements Runnable{

    private JFrame frame;

    public DrawingInterface(){

    }

    @Override
    public void run() {
        frame = new JFrame("GamePanel");
        frame.setPreferredSize(new Dimension(500, 500));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents(Container container){
        container.add(new DrawingBoard());
    }



    public JFrame getFrame() {
        return frame;
    }
}
