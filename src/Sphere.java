import java.lang.Math;

class Sphere extends Shape{
    //sphere attributes
    //instantiated objects don't really have names unless you allow them to have a name as an attribute. adding a name for clarity.
    private String name;
    private double radius;

    public Sphere(String sphereName, double sphereRadius){ //parameterized constructor
        this.radius = sphereRadius;
        this.name = sphereName;
    }

    double surface_area() {
        return 4 * Math.PI * Math.pow(radius, 2); //surface area of sphere == 4πr²
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); //volume of sphere == (4/3)πr³
    }

    @Override
    public String toString(){
        System.out.println("The radius of " + getSphereName() +  " is " + radius);
        System.out.println("The surface area of " + getSphereName() + " is " + surface_area());
        System.out.println("The volume of " + getSphereName() + " is " + volume());
        return null;
    }

    //getters and setters
    public String getSphereName(){ //read only. don't want name to be changed
        return this.name;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }

}
