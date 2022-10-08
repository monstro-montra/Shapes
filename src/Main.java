public class Main {

    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        sphere.setRadius(5);
        System.out.println("The surface area of this sphere is: " + sphere.surface_area());
        System.out.println("The volume of this sphere is: " + sphere.volume());

    }
}