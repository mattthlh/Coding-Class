import Shape.Cube;
import Shape.RectangularPrism;
import Shape.Shape;
import Shape.Sphere;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        int[] myArr = new int[2];
        myArr[0] = 9;
        myArr[1] = 2;
        int c = calculate(myArr);
        System.out.println(myArr[0] + " " + myArr[1] + " " + c);

    }

    public static int calculate(int[] arr) {
        arr[0] = arr[0] - arr[1];
        int c = arr[1];
        arr[1] = arr[0] * arr[0];
        arr[0] = arr[1] - (arr[0] + c);
        return arr[0];
    }
}
