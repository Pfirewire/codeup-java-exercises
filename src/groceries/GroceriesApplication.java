package groceries;
import util.Input;
import java.util.*;
public class GroceriesApplication {
    private static GroceryList masterList = new GroceryList();
    private static Input inpt = new Input();

    public static String getCategory() {
        int userOption;
        System.out.println ("" +
                "1. Produce\n" +
                "2. Dairy\n" +
                "3. Drinks\n" +
                "4. Snacks\n" +
                "5. Frozen\n" +
                "6. Custom Category\n\n");
        userOption = inpt.getInt("Enter option: ");
        switch (userOption) {
            case 1:
                return "Produce";
            case 2:
                return "Dairy";
            case 3:
                return "Drinks";
            case 4:
                return "Snacks";
            case 5:
                return "Frozen";
            case 6:
                return inpt.getString("Enter custom category: ");
            default:
                return "";
        }
    }

    public static void addItems() {
        System.out.println ("Please choose the category to add items:\n");
        addItems(getCategory());
    }

    public static void addItems(String category) {
        String item;
        int quantity;
        boolean willContinue = true;
        System.out.printf("Adding items to the %s category.%n%n", category);
        do {
            item = inpt.getString("Item name: ");
            quantity = inpt.getInt("Amount: ");
            masterList.addEntry(category, item, quantity);
            System.out.printf("Do you wish to add another item to %s? ", category);
            willContinue = inpt.yesNo();
        } while (willContinue);
    }

    public static void main(String[] arg) {
        int userOption;
        boolean willContinue = true;

        do {
            System.out.println("" +
                    "1. Add Items to List\n" +
                    "2. Show Full List\n" +
                    "3. Show List by Category\n" +
                    "4. Edit List\n" +
                    "0. Exit\n");
            userOption = inpt.getInt("Enter Option: ");
            switch (userOption) {
                case 0:
                    willContinue = false;
                    break;
                case 1:
                    addItems();
                    break;
                case 2:
                    masterList.printList();
                    break;
                case 3:
                    masterList.printList(getCategory());
                    break;
            }
        } while (willContinue);
    }
}
