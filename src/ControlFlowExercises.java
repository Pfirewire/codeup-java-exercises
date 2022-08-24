import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 2;
        double square;
        do {
            System.out.println(i);
            square = Math.pow(i, 2);
            i = (int) square;
        } while (i < 1000000);
    }
}
