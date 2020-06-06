package Examples;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SwingImage1 extends JFrame {

    public static void main(String avg[]) throws IOException
    {
        new SwingImage1();
    }

    public SwingImage1() throws IOException
    {
        BufferedImage img = ImageIO.read(new File("/Users/matthe/projects/Coding-Class/src/Examples/2016476_1.jpg"));
        ImageIcon icon = new ImageIcon(img);

        this.setSize(800,600);
        JLabel lbl = new JLabel();
        ((JLabel) lbl).setIcon(icon);
        lbl.setSize(400,200);
        this.add(lbl);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
