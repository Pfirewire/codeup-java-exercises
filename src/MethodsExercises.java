import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter a number: ");
        int userNum1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int userNum2 = scanner.nextInt();

        System.out.printf("%s + %s is: %s%n", userNum1, userNum2, addition(userNum1, userNum2));
        System.out.printf("%s - %s is: %s%n", userNum1, userNum2, subtraction(userNum1, userNum2));
        System.out.printf("%s * %s is: %s%n", userNum1, userNum2, multiplication(userNum1, userNum2));
        System.out.printf("%s / %s is: %s%n", userNum1, userNum2, division(userNum1, userNum2));
        System.out.printf("%s %% %s is: %s%n", userNum1, userNum2, modulus(userNum1, userNum2));

        System.out.print("Enter a minimum: ");
        int userMin = scanner.nextInt();
        System.out.print("Enter a maximum: ");
        int userMax = scanner.nextInt();
        int userNum = getInteger(userMin, userMax);
        System.out.printf("Your number between %s and %s is %s.", userMin, userMax, userNum);
    }

    public  static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        int total = num1;
//        for(int i = 0; i < num2; i++){
//            total += num1;
//        }
        if(num2 == 0){
            return 0;
        }
        return total + multiplication(num1, num2 - 1);
    }

    public static float division(int num1, int num2) {
        return (float) num1 / (float) num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.printf("Please enter a number between %s and %s: ", min, max);
        int userInput = scanner.nextInt();
        if(userInput < max && userInput > min) {
            return userInput;
        } else {
            return getInteger(min, max);
        }
    }
}