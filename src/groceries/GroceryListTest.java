package groceries;
import java.util.*;
import util.Input;
public class GroceryListTest {
    public static void main(String[] arg) {
        GroceryList masterList = new GroceryList();
        masterList.addEntry("Produce", "Apples", 3);
        masterList.addEntry("Produce", "Oranges", 6);

        masterList.printList();
        masterList.removeItem("Produce", "Apples");

        masterList.printList();

        System.out.println(masterList.getQuantity("Produce", "Oranges"));
        System.out.println(masterList.categoryOfItem("Oranges"));
//        ArrayList<GroceryListEntry> list = new ArrayList<>();
//        list.add(new GroceryListEntry("Apples", 2));
//        list.add(new GroceryListEntry("Oranges", 5));
//
//        System.out.println(list.get(0).contains("Apples"));
    }
}
