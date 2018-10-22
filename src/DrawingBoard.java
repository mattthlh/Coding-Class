import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel {

    public DrawingBoard(){
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);

        graphics.setColor(Color.YELLOW);
        graphics.fillOval(50, 50, 350, 350);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(170, 100, 170, 160);
        graphics.drawLine(300, 100, 300, 160);
        graphics.fillRect(200, 250, 30, 30);
        graphics.setColor(Color.RED);
        graphics.fillOval(170, 330, 100, 30);
    }
}