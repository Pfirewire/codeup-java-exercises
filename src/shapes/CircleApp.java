package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input inputter = new Input();
        Circle myCircle;
        boolean userContinue;
        int circleAmount = 0;
        do {
            myCircle = new Circle(inputter.getDouble("Enter a radius: "));
            circleAmount++;
            System.out.println("The circumference is " + myCircle.getCircumference());
            System.out.println("The area is " + myCircle.getArea());
            userContinue = inputter.yesNo("Do you wish to create another circle? (Y/N): ");
        } while (userContinue);
        System.out.printf("You created %s circles!%n", circleAmount);
    }
}
