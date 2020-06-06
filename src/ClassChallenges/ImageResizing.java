package ClassChallenges;

import Examples.SwingImage1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageResizing extends JFrame{

    public static void main(String avg[]) throws IOException
    {
        new ImageResizing();
    }

    public ImageResizing() throws IOException
    {
        BufferedImage img = ImageIO.read(new File("/Users/matthe/projects/Coding-Class/src/ClassChallenges/big-sheep.jpg"));

        Image newImage = img.getScaledInstance(800, 600, Image.SCALE_DEFAULT);

        ImageIcon icon = new ImageIcon(newImage);

        this.setSize(800,600);
        JLabel lbl = new JLabel();
        ((JLabel) lbl).setIcon(icon);
        this.add(lbl);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
