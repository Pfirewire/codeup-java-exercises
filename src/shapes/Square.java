package shapes;

public class Square extends Rectangle{
    private static int side;

    public Square(){
        super();
        this.side=0;
    }

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public static int getArea() {
        return side ^ 2;
    }

    public static int getPerimeter() {
        return 4 * side;
    }
}
