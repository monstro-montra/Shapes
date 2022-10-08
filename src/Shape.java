public abstract class Shape {
    //abstract classes cannot be instantiated
    //abstract methods allow us to have some sort of generalization, which will be detailed in subclasses.
    //e.g., all 3D shapes have surface areas and volume. a sphere will have those calculated
    //differently than a cylinder, just as a pyramid will have them calculated differently compared to
    //a cube.
    abstract double surface_area(); // abstract method for surface area
    abstract double volume(); // abstract method for volume

}
