package Snake;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Apple extends Entity{

    public Apple(int x, int y, int tileSize){
        super(x, y, tileSize);
    }

    public void paint(Graphics g){
        try {
            BufferedImage img = ImageIO.read(new File("apple.png"));
            g.drawImage(img, getX() * getTileSize(), getY() * getTileSize(), getTileSize(), getTileSize(), null);
        } catch(IOException e) {
            e.printStackTrace();
            g.setColor(Color.RED);
            g.fillRect(getX() * getTileSize(), getY() * getTileSize(), getTileSize(), getTileSize());
        }
    }
}
