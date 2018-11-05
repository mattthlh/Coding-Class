package Snake;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    private Thread thread;
    private boolean running;

    public void init(){
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void stop(){
        running = false;
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(){

    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        for(int i = 0; i < 50; i++){
            g.drawLine(i * 10, 0, i * 10, 500);
            g.drawLine(0, i * 10, 500, i * 10);
        }
        g.setColor(Color.GREEN);
        g.fillOval(10, 10, 20, 20);
        g.fillOval(30, 10, 20, 20);
        g.fillOval(50, 10, 20, 20);
        g.fillOval(70, 10, 20, 20);
        g.fillOval(90, 10, 20, 20);
        repaint();

        g.setColor(Color.RED);
        int x = (int) Math.floor(Math.random() * 51);
        int y = (int) Math.floor(Math.random() * 51);

        g.drawString("X", x * 10, y * 10);
    }

    @Override
    public void run(){
        while (running) {
            update();
            repaint();
        }
    }
}
