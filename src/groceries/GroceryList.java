package groceries;
import java.util.*;

public class GroceryList {
    HashMap<String, ArrayList<GroceryListEntry>> groceryList;

    public GroceryList() {
        groceryList = new HashMap<>();
    }

    public boolean hasCategory(String category) {
        if(!groceryList.containsKey(category)) {
            return false;
        } else {
            return true;
        }
    }
    public boolean hasItem(String category, String item) {
        ArrayList<GroceryListEntry> categoryList = groceryList.get(category);
        boolean contains = false;
        for(GroceryListEntry entry : categoryList) {
            if(entry.contains(item)) {
                contains = true;
            }
        }
        if(!groceryList.containsKey(category) || !contains) {
            return false;
        } else {
            return true;
        }
    }

    public void removeItem(String category, String item) {
        for(int i = 0; i < groceryList.get(category).size(); i++) {
            if(groceryList.get(category).get(i).contains(item)) {
                groceryList.get(category).remove(i);
            }
        }
    }

    public int getQuantity(String category, String item) {
        ArrayList<GroceryListEntry> list = groceryList.get(category);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).contains(item)){
                return list.get(i).getQuantity();
            }
        }
        return -1;
    }

    public void setQuantity(String category, String item, int quantity) {
        ArrayList<GroceryListEntry> list = groceryList.get(category);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(item)){
                list.get(i).setQuantity(quantity);
            }
        }
//        int index = groceryList.get(category).indexOf(item);
//        groceryList.get(category).get(index).setQuantity(quantity);
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
        if(!this.hasCategory(category)) {
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
