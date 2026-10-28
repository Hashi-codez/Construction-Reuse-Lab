package software.reuse.task3.fixed;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setDimensions(5, 10);

        Square sq = new Square();
        sq.setSide(5);

        Shape[] shapes = { rect, sq };   // both safely substitutable as Shape
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " area: " + s.area());
        }
    }
}
