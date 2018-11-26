package Snake;

import java.util.jar.JarException;

public class SandBox{
    static int fps = 2;
    public static void main(String[] args){
        System.out.println("Anything");
        while(true){
            try {
                Thread.sleep(1000 / fps);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("SOMETHING ELSE");
        }
    }
}
