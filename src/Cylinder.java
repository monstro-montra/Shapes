import java.lang.Math;

public class Cylinder extends Shape{
    //cylinder attributes
    //instantiated objects don't really have names unless you allow them to have a name as an attribute. adding a name for clarity.
    private final String name;
    private final double height;
    private final double radius;

    public Cylinder(String cylinderName, double cylinderHeight, double cylinderRadius){ //parameterized constructor
        this.name = cylinderName;
        this.height = cylinderHeight;
        this.radius = cylinderRadius;
    }

    double surface_area() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)); //surface area of a cylinder == 2πrh+2πr²
    }

    double volume() {
        return Math.PI * Math.pow(radius, 2) * height; //volume of a cylinder == πr²h
    }

    @Override
    public String toString(){
        System.out.println("The height of " + getCylinderName() +  " is " + height);
        System.out.println("The radius of " + getCylinderName() +  " is " + radius);
        System.out.println("The surface area of " + getCylinderName() + " is " + surface_area());
        System.out.println("The volume of " + getCylinderName() + " is " + volume());
        return null;
    }

    //getters and setters
    public String getCylinderName(){ //read only. don't want name to be changed
        return this.name;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getHeight() {
        return height;
    }

}
