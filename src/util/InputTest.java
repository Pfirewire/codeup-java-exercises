package util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
        System.out.println("Testing getString:");
        System.out.println(test.getString());
        System.out.println(test.getString("Enter String: "));

        System.out.println("Testing yesNo:");
        System.out.println(test.yesNo());
        System.out.println(test.yesNo("y/n: "));

        System.out.println("Testing getInt:");
        System.out.println(test.getInt());
        System.out.println(test.getInt("Enter int: "));

        System.out.println("Testing getInt(1, 10):");
        System.out.println(test.getInt(1, 10));
        System.out.println(test.getInt(1, 10, "Enter int between 1 to 10: "));

        System.out.println("Testing getDouble:");
        System.out.println(test.getDouble());
        System.out.println(test.getDouble("Enter a double: "));

        System.out.println("Testing getDouble(1.5, 9.5):");
        System.out.println(test.getDouble(1.5, 9.5));
        System.out.println(test.getDouble(1.5, 9.5, "Enter double between 1.5 to 9.5: "));
    }
}

