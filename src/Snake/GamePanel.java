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
    }

    @Override
    public void run(){
        while (running) {
            update();
            repaint();
        }
    }
}
