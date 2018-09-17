package Shape;

public class RectangularPrism extends Shape {
    double height;
    double length;
    double width;

    public RectangularPrism() {
        this(0, 0, 0);
    }

    public RectangularPrism(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width =  width;
    }

    @Override
    public void calculateVolume() {
        double volume = height * length * width;
        setVolume(volume);
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = 2 * (width * length + height * length + height * width);
        setSurfaceArea(surfaceArea);
    }
}
