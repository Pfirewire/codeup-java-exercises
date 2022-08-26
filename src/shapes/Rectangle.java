package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle () {
        this(0, 0);
    }

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double Length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


//    private static int length;
//    private static int width;
//
//    public Rectangle() {
//        this(0, 0);
//    }
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public static int getLength() {
//        return length;
//    }
//
//    public static int getWidth() {
//        return width;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public static int getArea() {
//        return length * width;
//    }
//
//    public static int getPerimeter() {
//        return 2 * length + 2 * width;
//    }
}
