package Shape;

public class Sphere extends Shape{
    double radius;

    public Sphere(){
        this(0);
    }

    public Sphere(int radius){
        this.radius = radius;
        double volume = 4/3 * Math.PI * Math.pow(this.radius, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(this.radius, 2);
        setSurfaceArea(surfaceArea);
        setVolume(volume);
    }
}
