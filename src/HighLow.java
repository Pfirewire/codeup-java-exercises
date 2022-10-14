import java.util.Scanner;

public class HighLow {

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * max) + min;
    }

    // getGuess
    public static int getGuess(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Please enter your guess: ");
        return scanner.nextInt();
    }
    public static void main(String[] args) {
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
            System.out.printf("%s%n", randomNumber);
            do {
                userGuess = getGuess();
                amountOfGuesses++;
                if (userGuess < randomNumber) {
                    System.out.println("HIGHER");
                } else if (userGuess > randomNumber) {
                    System.out.println("LOWER");
                } else {
                    userIsCorrect = true;
                }
            } while (!userIsCorrect && amountOfGuesses < guessLimit);
            if(amountOfGuesses <= guessLimit) {
                System.out.println("GOOD GUESS!");
                if(amountOfGuesses == 1) {
                    System.out.printf("It took you %s guess!%n", amountOfGuesses);
                } else {
                    System.out.printf("It took you %s guesses!%n", amountOfGuesses);
                }
            } else {
                System.out.println("I'm sorry, you ran out of guesses :(");
            }
            System.out.print("Would you like to play again? (Y|N): ");
            userContinue = scanner.next();
        } while(userContinue.equals("Y") || userContinue.equals("y"));
    }
}