import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);
    }
}
