package software.reuse.task3.flawed;

public class Rectangle {
    protected int width;
    protected int height;

    public void setDimensions(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int area() {
        return width * height;
    }
}
