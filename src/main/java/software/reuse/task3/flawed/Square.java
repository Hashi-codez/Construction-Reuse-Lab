package software.reuse.task3.flawed;

public class Square extends Rectangle {
    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {   // stricter precondition, which breaks LSP
            throw new IllegalArgumentException("Square requires width == height");
        }
        super.setDimensions(w, h);
    }
}
