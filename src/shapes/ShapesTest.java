package shapes;

public class ShapesTest {
    public static void main(String[] arg) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.printf("Perimeter: %s%nArea: %s%n", box1.getPerimeter(), box1.getArea());
        Rectangle box2 = new Square(5);
        System.out.printf("Perimeter: %s%nArea: %s%n", box2.getPerimeter(), box2.getArea());
    }
}
