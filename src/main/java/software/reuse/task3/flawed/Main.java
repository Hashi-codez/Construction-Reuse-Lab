package software.reuse.task3.flawed;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(5, 10);
        System.out.println("Rectangle area: " + r.area());

        // Treat a Square as a generic Rectangle
        Rectangle shape = new Square();
        System.out.println("Setting w=5, h=10 on a Square via Rectangle reference...");
        shape.setDimensions(5, 10);   // CRASHES here
        System.out.println("Area: " + shape.area());
    }
}
