package assessmentReview;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PracticeTest {

    public static void printList(ArrayList<Integer> list) {
        for(int item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        System.out.println(Practice.average(new int[] {5, 5, 10, 10}));
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(4);
        numList.add(3);
        printList(numList);
        numList = Practice.multiplyAll(2, numList);
        printList(numList);
    }
}
