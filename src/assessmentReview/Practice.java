package assessmentReview;

public class Practice {

    public static int subtractTen(int num) {
        return num - 10;
    }

    public static double average(int[] nums) {
        int total = 0;
        for(int num : nums) {
            total += num;
        }
        return (double) total/nums.length;
    }

    public static void main(String[] args) {

    }
}
