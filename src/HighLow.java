import java.util.Random;
import java.util.Scanner;

public class HighLow {

    private static Random random = new Random();

    public static int randomNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static int getGuess(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Please enter your guess: ");
        return scanner.nextInt();
    }

    public static boolean checkGuess(int userGuess, int randomNumber) {
        if (userGuess < randomNumber) {
            System.out.println("HIGHER");
            return false;
        } else if (userGuess > randomNumber) {
            System.out.println("LOWER");
            return false;
        } else {
            return true;
        }
    }

    public static void printResult(boolean userIsCorrect, int amountOfGuesses) {
        if(userIsCorrect) {
            System.out.println("GOOD GUESS!");
            if(amountOfGuesses == 1) {
                System.out.printf("It took you %s guess!%n", amountOfGuesses);
            } else {
                System.out.printf("It took you %s guesses!%n", amountOfGuesses);
            }
        } else {
            System.out.println("I'm sorry, you ran out of guesses :(");
        }
    }

    public static void highLowGame() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String userContinue;
        int guessLimit = 10;
        System.out.println("Let's play a game! In this game, you will try to guess the number between (and including) 1 to 100.\nYou will be told if the number is HIGHER or LOWER than the number you guessed.");
        do {
            System.out.printf("You only have %s guesses to get it right, so think carefully!%n", guessLimit);
            boolean userIsCorrect = false;
            int randomNumber = randomNumber(1, 100);
            int amountOfGuesses = 0;
            int userGuess;
//            System.out.printf("%s%n", randomNumber);
            do {
                userGuess = getGuess();
                amountOfGuesses++;
                userIsCorrect = checkGuess(userGuess, randomNumber);
            } while (!userIsCorrect && amountOfGuesses < guessLimit);
            printResult(userIsCorrect, amountOfGuesses);
            System.out.print("Would you like to play again? (Y|N): ");
            userContinue = scanner.next();
        } while(userContinue.equals("Y") || userContinue.equals("y"));
    }

    public static void main(String[] args) {
        highLowGame();
    }
}