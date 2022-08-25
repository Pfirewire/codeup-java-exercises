package shapes;

public class Rectangle {
    private static int length;
    private static int width;

    public Rectangle() {
        this(0, 0);
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static int getLength() {
        return length;
    }

    public static int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static int getArea() {
        return length * width;
    }

    public static int getPerimeter() {
        return 2 * length + 2 * width;
    }
}
