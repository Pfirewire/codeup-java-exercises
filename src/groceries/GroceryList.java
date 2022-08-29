package groceries;
import java.util.*;

public class GroceryList {
    HashMap<String, ArrayList<GroceryListEntry>> groceryList;

    public GroceryList() {
        groceryList = new HashMap<>();
    }

    public void addCategory(String category) {
        ArrayList<GroceryListEntry> emptyArrayList = new ArrayList<>();
        groceryList.putIfAbsent(category, emptyArrayList);
    }

    public void addEntry(String category, String item, int quantity) {
        GroceryListEntry entry = new GroceryListEntry(item, quantity);
        this.addEntry(category, entry);
    }

    public void addEntry(String category, GroceryListEntry entry) {
        if(!groceryList.containsKey(category)) {
            this.addCategory(category);
            this.addEntry(category, entry);
        } else {
            ArrayList<GroceryListEntry> oldList = groceryList.get(category);
            oldList.add(entry);
            groceryList.replace(category, oldList);
        }
    }

    public void printList() {
        sortList();
        System.out.println("------------------------------------------------");
        groceryList.forEach((category, entryList) -> entryList.forEach((entry) -> {
            System.out.format("%-20s: %-3d |%s%n", entry.getItem(), entry.getQuantity(), category);
        }));
        System.out.println("------------------------------------------------");
    }

    public void printList(String category) {
        ArrayList<GroceryListEntry> list;
        sortList();
        System.out.println("------------------------------------------------");
        if(!groceryList.containsKey(category)) {
            System.out.println("You have no items in that category.");
        } else {
            list = groceryList.get(category);
            list.forEach((entry) -> System.out.format("%-20s: %-3d |%s%n", entry.getItem(), entry.getQuantity(), category));
        }
        System.out.println("------------------------------------------------");
    }

    public void sortList() {
        for (ArrayList<GroceryListEntry> entryList : groceryList.values()) {
            Collections.sort(entryList, Comparator.comparing(GroceryListEntry::getItem));
        }
    }
}
