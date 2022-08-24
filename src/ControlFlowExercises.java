import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String userResponse;
        do {
            System.out.print("What number would you like the table of powers to go to? ");
            int userInt = scanner.nextInt();
            System.out.printf("Here is your table!%n%nnumber    |squared   |cubed     %n----------|----------|----------%n");
            for (int i = 1; i <= userInt; i++) {
                System.out.printf("%-10d|%-10d|%-10d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
            }
            System.out.print("Do you wish to try again? Y/N ");
            scanner.nextLine();
            userResponse = scanner.nextLine();
        } while (userResponse.equals("y") || userResponse.equals("Y"));
    }
}
