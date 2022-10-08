import java.lang.Math;
class Sphere extends Shape{

    private double radius;
    private double surfaceArea;
    private double volume;


    public Sphere(double sphereRadius){ //parameterized constructor
        sphereRadius = this.radius;
    }

    public Sphere(){ //overloading to provide no args version of this constructor

    }

    @Override
    double surface_area() {
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }
    @Override
    double volume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }

}
