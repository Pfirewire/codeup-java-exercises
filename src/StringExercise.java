import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        String firstOutput = "We don't need no education\n" + "We don't need no thought control";
        System.out.println(firstOutput);
        String secondOutput = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(secondOutput);
        String thirdOutput = "In windows, the main drive is usually C:\\";
        System.out.println(thirdOutput);
        String fourthOutput = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
        System.out.println(fourthOutput);
    }
}
