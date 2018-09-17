import Shape.Cube;
import Shape.RectangularPrism;
import Shape.Shape;
import Shape.Sphere;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> arrayList = new ArrayList<>();
        Shape cube = new Cube(2);
        Shape rectangularPrism = new RectangularPrism(3,5,8);
        Shape sphere = new Sphere(4);

        arrayList.add(cube);
        arrayList.add(rectangularPrism);
        arrayList.add(sphere);

        for (Shape shape : arrayList) {
            System.out.println(shape.getSurfaceArea());
            System.out.println(shape.getVolume());
        }
    }
}