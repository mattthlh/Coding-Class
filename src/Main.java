import Shape.Cube;
import Shape.RectangularPrism;
import Shape.Sphere;

public class Main
{
	public static void main(String args[]) {
		Sphere mySphere = new Sphere(3);
        RectangularPrism myRect = new RectangularPrism(1, 2, 3);
        Cube myCube = new Cube(3);

        System.out.println(mySphere.getVolume());
        System.out.println(mySphere.getSurfaceArea());

        System.out.println(myRect.getVolume());
        System.out.println(myRect.getSurfaceArea());

        System.out.println(myCube.getVolume());
        System.out.println(myCube.getSurfaceArea());
	}
}