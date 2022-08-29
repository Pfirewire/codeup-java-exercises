package groceries;
import java.util.*;
public class GroceryListEntry {
    private String item;
    private int quantity;

    public GroceryListEntry(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public String getItem() { return item; }
    public int getQuantity() { return quantity; }


//    @Override
//    public int compareTo(GroceryListEntry compareEntry) {
//        return 0;
//    }
}
