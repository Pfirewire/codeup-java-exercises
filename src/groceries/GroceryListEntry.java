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

    public void setItem(String item){ this.item = item; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public boolean contains(String item) {
        return this.item.equals(item);
    }


//    @Override
//    public int compareTo(GroceryListEntry compareEntry) {
//        return 0;
//    }
}
