import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.print("The value of pi is approximately ");
        System.out.format("%.2f%n", pi);
//
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter three words, pressing enter between each one: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.printf("You entered :%n%s%n%s%n%s%n", firstWord, secondWord, thirdWord);

        System.out.print("Enter a sentence: ");
        scanner.nextLine();
        String mySentence = scanner.nextLine();
        System.out.printf("The sentence you entered is: %s%n", mySentence);

        System.out.print("Enter length: ");
        String userLength = scanner.nextLine();

        System.out.print("Enter width: ");
        String userWidth = scanner.nextLine();

        System.out.print("Enter height: ");
        String userHeight = scanner.nextLine();

        System.out.printf("Length: %s%nWidth: %s%n", userLength, userWidth);

        double userLengthDouble = Double.parseDouble(userLength);
        double userWidthDouble = Double.parseDouble(userWidth);
        double userHeightDouble = Double.parseDouble(userHeight);
        double userArea = userLengthDouble * userWidthDouble;
        double userPerimeter = (2 * userLengthDouble) + (2 * userWidthDouble);
        double userVolume = userArea * userHeightDouble;

        System.out.format("The area with the parameters you entered is: %.2f%n", userArea);
        System.out.format("The perimeter with the parameters you entered is: %.2f%n", userPerimeter);
        System.out.format("The volume with the parameters you entered is: %.2f%n", userVolume);


    }
}
