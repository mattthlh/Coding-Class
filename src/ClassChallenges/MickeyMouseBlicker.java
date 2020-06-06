package ClassChallenges;

import java.awt.*;
import javax.swing.*;
public class MickeyMouseBlicker extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MickeyMouseBlicker();
    }
    public MickeyMouseBlicker(){
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        while(true){
            try{
                Thread.sleep(300);
            }catch(InterruptedException e){}
            blink = !blink;
            paint(this.getGraphics());
        }
    }
    Color skinColor = new Color(255,214,194);
    boolean blink = false;
    public void paint(Graphics g){
        super.paint(g);
        //Head & Ears
        g.setColor(Color.BLACK);
        g.fillOval(250-30-150, 100, 150, 150);
        g.fillOval(250+30, 100, 150, 150);
        g.fillOval(250-125, 150, 250, 250);

        //Skin
        g.setColor(skinColor);
        g.fillArc(250-125, 150, 250, 250, 180, 180);
        g.fillOval(250-125, 150+125-30, 250, 60);
        g.fillOval(250-100+20, 150+10, 100, 250-20);
        g.fillOval(250-20, 150+10, 100, 250-20);

        //Left Eye
        g.setColor(Color.WHITE);
        g.fillOval(250-10-40, 150+40, 40, 80);
        g.setColor(Color.BLACK);
        g.drawOval(250-10-40, 150+40, 40, 80);
        g.fillOval(250-10-40+10, 150+40+40, 20, 30);

        //Right Eye
        if(blink){
            g.setColor(Color.WHITE);
            g.fillOval(250+10, 150+40, 40, 80);
            g.setColor(Color.BLACK);
            g.drawOval(250+10, 150+40, 40, 80);
            g.fillOval(250+10+10, 150+40+40, 20, 30);
        }else{
            g.drawLine(250+10, 150+40+40, 250+10+40, 150+40+40);
        }

        //Mouse
        g.fillArc(250-40, 150+70, 80, 130, 180+25, 130);
        g.setColor(Color.pink);
        g.fillOval(250-30, 150+175, 60, 25);
        g.setColor(Color.black);

        //Nose
        g.drawArc(250-55, 150+118, 110, 30, 15, 150);
        g.setColor(skinColor);
        g.fillArc(250-70, 150+130, 140, 40, 170, 200);
        g.setColor(Color.black);
        g.drawArc(250-70, 150+130, 140, 40, 190, 160);
        g.fillOval(250-25, 150+130, 50, 25);

    }
}

