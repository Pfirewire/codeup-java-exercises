import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("Welcome to your chat with Bob! You can talk to him as much as you want, just make sure to type only \"EXIT\" when you're done talking.");
        do {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if(userInput.equals("EXIT")){
                break;
            } else if (userInput.length() == 0) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                char lastChar = userInput.charAt(userInput.length() - 1);
                if (lastChar == '?') {
                    System.out.println("Bob: Sure.");
                } else if (lastChar == '!') {
                    System.out.println("Bob: Whoa, chill out!");
                } else {
                    System.out.println("Bob: Whatever.");
                }
            }
        } while (true);
    }
}
