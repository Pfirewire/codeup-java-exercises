package assessmentReview;

import java.util.ArrayList;

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

    public static ArrayList<Integer> multiplyAll(int multiplyNum, ArrayList<Integer> nums) {
        for(int i = 0; i < nums.size(); i++) {
            nums.set(i, (nums.get(i) * multiplyNum));
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
