package Snake;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main {

    private static MediaPlayer mediaPlayer;

    public static void main(String args[]){
        JFrame frame;

        GamePanel gamePanel = new GamePanel();

        frame = new JFrame("GamePanel");
        frame.add(gamePanel);
        frame.setPreferredSize(new Dimension(500, 522));
        frame.pack();
        frame.setVisible(true);
        playMusic();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void playMusic() {
        final JFXPanel fxPanel = new JFXPanel();
        String music = "/Users/matthe/projects/Coding-Class/src/Snake/Laszlo - Our Arrival.mp3";
        Media hit = new Media(new File(music).toURI().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }
}
