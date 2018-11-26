package Snake;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String args[]){
        JFrame frame;

        GamePanel gamePanel = new GamePanel();

        frame = new JFrame("GamePanel");
        frame.add(gamePanel);
        frame.setPreferredSize(new Dimension(500, 522));
        frame.pack();
        frame.setVisible(true);
    }
}
