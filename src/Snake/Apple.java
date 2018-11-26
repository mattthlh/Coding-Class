package Snake;

import java.awt.*;

public class Apple extends Entity{

    public Apple(int x, int y, int tileSize){
        super(x, y, tileSize);
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(getX() * getTileSize(), getY() * getTileSize(), getTileSize(), getTileSize());
    }
}
