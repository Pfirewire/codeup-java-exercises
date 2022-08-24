public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.println("World!");

        int myFavoriteNumber = 12;
        System.out.println(myFavoriteNumber);
        String myString = "some string";
        // String myString = 'some string';
        // String myString = 3.14159;
        System.out.println(myString);
        float myNumber = (float) 3.14;
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        String class;
        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
        System.out.println(o);
//        int x = 4;
//        x += 5;
//        int x = 3;
//        int y = 4;
//        y *= x;
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        byte myByte = 127;
        myByte += 10;
        System.out.println(myByte);

    }
}

