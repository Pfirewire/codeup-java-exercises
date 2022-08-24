import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String userResponse;
        do {
            System.out.print("Enter a numerical grade from 0 to 100: ");
            int grade = scanner.nextInt();
            if (grade >= 98) {
                System.out.printf("%s percent is an A+%n", grade);
            } else if (grade >= 92) {
                System.out.printf("%s percent is an A%n", grade);
            } else if (grade >= 90) {
                System.out.printf("%s percent is an A-%n", grade);
            } else if (grade >= 88) {
                System.out.printf("%s percent is a B+%n", grade);
            } else if (grade >= 82) {
                System.out.printf("%s percent is a B%n", grade);
            } else if (grade >= 80) {
                System.out.printf("%s percent is a B-%n", grade);
            } else if (grade >= 78) {
                System.out.printf("%s percent is a C+%n", grade);
            } else if (grade >= 72) {
                System.out.printf("%s percent is a C%n", grade);
            } else if (grade >= 70) {
                System.out.printf("%s percent is a C-%n", grade);
            } else if (grade >= 68) {
                System.out.printf("%s percent is a D+%n", grade);
            } else if (grade >= 62) {
                System.out.printf("%s percent is a D%n", grade);
            } else if (grade >= 60) {
                System.out.printf("%s percent is a D-%n", grade);
            } else {
                System.out.printf("%s percent is an F%n", grade);
            }
            System.out.print("Do you wish to try again? Y/N ");
            scanner.nextLine();
            userResponse = scanner.nextLine();
        } while (userResponse.equals("y") || userResponse.equals("Y"));
    }
}
