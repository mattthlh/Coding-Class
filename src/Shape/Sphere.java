package Shape;

public class Sphere extends Shape {
    double radius;

    public Sphere() {
        this(0);
    }

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateVolume() {
        double volume = 4.0/3.0 * Math.PI * Math.pow(this.radius, 3);
        setVolume(volume);
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = 4.0 * Math.PI * Math.pow(this.radius, 2);
        setSurfaceArea(surfaceArea);
    }
}
