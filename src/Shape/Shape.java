package Shape;

public class Shape {
    double volume;
    double surfaceArea;

    public Shape() {
        this.volume = 0;
        this.surfaceArea = 0;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSurfaceArea() {
        return this.surfaceArea;
    }

    public double getVolume(){
        return this.volume;
    }
}
