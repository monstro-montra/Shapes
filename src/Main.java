public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Sphere("Sphere",5);
        shapes[1] = new Cone("Cone", 5, 6);
        shapes[2] = new Cylinder("Cylinder", 5, 4);

        for (int i = 0; i < shapes.length; i++){
            if (shapes.getClass().getName().equals("Sphere")){
                shapes[i].toString();

            }

        }


    }
}