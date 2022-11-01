package quizzes;

public class JavaTwoQuiz {

    public static void main(String[] args) {
//        int[][] primes = new int[3][3];
//        primes[2][2] = 1;
//
//        System.out.println(primes[1][2]);

        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }
    }
}
