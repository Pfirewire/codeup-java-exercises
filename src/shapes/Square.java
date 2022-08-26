package shapes;

public class Square extends Quadrilateral implements Measurable {

    public Square() {
        this(0);
    }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }
    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }


//    private static int side;
//
//    public Square(){
//        super();
//        this.side=0;
//    }
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public static int getArea() {
//        return side ^ 2;
//    }
//
//    public static int getPerimeter() {
//        return 4 * side;
//    }
}
