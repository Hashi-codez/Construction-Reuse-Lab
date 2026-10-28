package software.reuse.task3.fixed;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public void setDimensions(int w, int h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public int area() {
        return width * height;
    }
}
