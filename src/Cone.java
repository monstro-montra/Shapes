import java.lang.Math;

public class Cone extends Shape{
    //cone attributes
    //instantiated objects don't really have names unless you allow them to have a name as an attribute. adding a name for clarity.
    private final String name;
    private double height;
    private double radius;

    public Cone(String coneName, double coneHeight, double coneRadius){ //parameterized constructor
        this.name = coneName;
        this.height = coneHeight;
        this.radius = coneRadius;
    }

    double surface_area() {
        return (Math.PI * radius) * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))); // surface area of cone == πr(r+√(h²+r²))
    }

    double volume() {
        return Math.PI * Math.pow(radius, 2) * (height/3); //volume of a cone == πr²(h/3)
    }

    @Override
    public String toString(){
        System.out.println("The height of " + getConeName() +  " is " + height);
        System.out.println("The radius of " + getConeName() +  " is " + radius);
        System.out.println("The surface area of " + getConeName() + " is " + surface_area());
        System.out.println("The volume of " + getConeName() + " is " + volume());
        return null;
    }

    //getters and setters
    public String getConeName(){ //read only. don't want name to be changed
        return this.name;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getHeight(){
        return this.height;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public void setHeight(double h){
        this.height = h;
    }

}
