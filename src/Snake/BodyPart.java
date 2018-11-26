package Snake;

import java.awt.*;

public class BodyPart extends Entity {
    public BodyPart(int x, int y, int tileSize){
        super(x, y, tileSize);
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(getX() * getTileSize(), getY() * getTileSize(), getTileSize(), getTileSize());
    }
}
