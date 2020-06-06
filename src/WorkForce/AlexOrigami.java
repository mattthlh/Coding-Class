package WorkForce;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AlexOrigami {
    static Scanner input;
    static float h, w, t;
    public static void main(String[] args) throws IOException {
        try {
            input = new Scanner(new File("alex.in"));
        } catch (Exception e) {
            System.out.println(e);
        }

        String rectangle = input.nextLine();

        String[] nums = rectangle.split(" ");

        h = Integer.parseInt(nums[0]);
        w = Integer.parseInt(nums[1]);

        if (h > w) {
            t = h;
            h = w;
            w = t;
        }
        float sol1 = w / 3;
        float sol2 = h / 2;

        float biggest;

        if(sol1 > sol2 && sol1 <= h){
            biggest = sol1;
        } else {
            biggest = sol2;
        }

        if(h*3 <= w && h > biggest) {
            biggest = h;
        }

        filewriter(biggest);
    }
        public static void filewriter(float string) throws IOException {
            String str = Float.toString(string);
            BufferedWriter writer = new BufferedWriter
                    (new FileWriter("alex.out", true));
            writer.newLine();
            writer.append(str);

            writer.close();
        }
}
