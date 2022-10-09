public class ShapeArray {
    Shape[] shapes;

    public static void main(String[] args) {
        ShapeArray shapeArray = new ShapeArray(); // ShapeArray object made to be able to call printArray() method.
        shapeArray.fillArray();
        shapeArray.printArray();

    }
    public void fillArray(){ // this will instantiate and fill shapes[i] with data.
        shapes = new Shape[3];
        shapes[0] = new Sphere("Sphere",0.1); // sphereName, sphereRadius
        shapes[1] = new Cone("Cone", 0.67, 70); //coneName, coneHeight, coneRadius
        shapes[2] = new Cylinder("Cylinder", 0.5, 0.9); // cylinderName, cylinderHeight, cylinderRadius

    }

    public void printArray(){ //this will loop through the array to print

        for (Shape shape : shapes) { //enhanced for loop to iterate through all the shapes
            switch (shape.getClass().getName()) { //get the class name. e.g., "Sphere"
                case "Sphere", "Cylinder", "Cone" -> { //Each overridden method from each subclass prints different info.
                    shape.ShapeToString(); //prints instance data using ShapeToString from said class. this method originates from Shape superclass
                    System.out.println(); //create extra line for spacing
                }
            }
        }

    }

}