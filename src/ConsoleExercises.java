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
        double userLength = scanner.nextDouble();

        System.out.print("Enter width: ");
        double userWidth = scanner.nextDouble();

        System.out.print("Enter height: ");
        double userHeight = scanner.nextDouble();

        System.out.format("Length: %.2f%nWidth: %.2f%n", userLength, userWidth);

        double userArea = userLength * userWidth;
        double userPerimeter = (2 * userLength) + (2 * userWidth);
        double userVolume = userArea * userHeight;

        System.out.format("The area with the parameters you entered is: %.2f%n", userArea);
        System.out.format("The perimeter with the parameters you entered is: %.2f%n", userPerimeter);
        System.out.format("The volume with the parameters you entered is: %.2f%n", userVolume);


    }
}
