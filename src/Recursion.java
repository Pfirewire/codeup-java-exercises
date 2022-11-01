import java.util.ArrayList;
import java.util.List;

public class Recursion {

    public static int min(ArrayList<Integer> nums) {
        if(nums.size() == 1) {
            return nums.get(0);
        } else if(nums.get(nums.size() - 1) > nums.get(nums.size() - 2)) {
            nums.remove(nums.size() - 1);
        } else {
            nums.remove(nums.size() - 2);
        }
        return min(nums);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(3, 15, 7, 1, 55, 34));
        System.out.println(min(nums));
    }
}

/*

 */
