package util;

public class InputTest {
    public static void main(String[] args) {
        Input inpt = new Input();
//        System.out.println("Testing getString:");
//        System.out.println(inpt.getString());
//        System.out.println(inpt.getString("Enter String: "));
//
//        System.out.println("Testing yesNo:");
//        System.out.println(inpt.yesNo());
//        System.out.println(inpt.yesNo("y/n: "));
//
//        System.out.println("Testing getInt:");
//        System.out.println(inpt.getInt());
//        System.out.println(inpt.getInt("Enter int: "));
//
//        System.out.println("Testing getInt(1, 10):");
//        System.out.println(inpt.getInt(1, 10));
//        System.out.println(inpt.getInt(1, 10, "Enter int between 1 to 10: "));
//
//        System.out.println("Testing getDouble:");
//        System.out.println(inpt.getDouble());
//        System.out.println(inpt.getDouble("Enter a double: "));
//
//        System.out.println("Testing getDouble(1.5, 9.5):");
//        System.out.println(inpt.getDouble(1.5, 9.5));
//        System.out.println(inpt.getDouble(1.5, 9.5, "Enter double between 1.5 to 9.5: "));

        System.out.println(inpt.getBinary(inpt.getString("Enter binary number: ")));
        System.out.println(inpt.getHex(inpt.getString("Enter hexadecimal number: ")));

    }
}

