package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
    }

    public String getString() {
        return scanner.next();
    }
    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }

    public boolean yesNo() {
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        do {
            if(userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.printf("Must be between %s and %s. ", min, max);
                userInput = getInt();
            }
        } while(true);
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        return getInt(min, max);
    }

    public int getInt() {
        try{
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Try again");
            return getInt();
        }
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        do {
            if(userInput >= min && userInput <= max) {
                return userInput;
            } else {
                System.out.printf("Must be between %s and %s. ", min, max);
                userInput = getDouble();
            }
        } while(true);
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.print(prompt);
        return getDouble(min, max);
    }

    public double getDouble() {
        try{
            return Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Try again");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return getDouble();
    }

    public int getBinary(String binaryNum) {
        return Integer.valueOf(binaryNum, 2);
    }

    public int getHex(String hexNum) {
        return Integer.valueOf(hexNum, 16);
    }
}
