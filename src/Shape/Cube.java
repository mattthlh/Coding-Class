package Shape;

public class Cube extends RectangularPrism {
    public Cube() {
        this(0);
    }

    public Cube(double sideLength) {
        super(sideLength, sideLength, sideLength);
    }
}
