import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.print("The value of pi is approximately ");
        System.out.format("%.2f%n", pi);
//
        Scanner scanner = new Scanner(System.in);
//
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter three words separated by spaces: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.printf("You entered :%n%s%n%s%n%s%n", firstWord, secondWord, thirdWord);

        System.out.print("Enter a sentence: ");
        scanner.nextLine();
        String mySentence = scanner.nextLine();
        System.out.printf("The sentence you entered is: %s%n", mySentence);
    }
}
