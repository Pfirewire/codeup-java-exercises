import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.printf("Here is your table!%n%nnumber    |squared   |cubed     %n----------|----------|----------%n");
        for(int i = 1; i <= userInt; i++) {
            System.out.printf("%-10d|%-10d|%-10d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }
}
