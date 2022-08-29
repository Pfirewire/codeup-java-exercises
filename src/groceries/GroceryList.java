package groceries;
import java.lang.reflect.Array;
import java.util.*;

public class GroceryList {
    HashMap<String, ArrayList<GroceryListEntry>> groceryList;

    public GroceryList() { groceryList = new HashMap<>(); }

    public boolean hasCategory(String category) { return groceryList.containsKey(category); }

    public boolean hasItem(String item) {
        for(ArrayList<GroceryListEntry> list : groceryList.values()) {
            for(GroceryListEntry entry : list) {
                if(entry.contains(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void removeItem(String category, String item) {
        ArrayList<GroceryListEntry> list = groceryList.get(category);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(item)) {
                list.remove(i);
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
        return 0;
    }

    public void setQuantity(String category, String item, int quantity) {
        ArrayList<GroceryListEntry> list = groceryList.get(category);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(item)){
                list.get(i).setQuantity(quantity);
            }
        }
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

    public String categoryOfItem(String item) {
        for(Map.Entry<String, ArrayList<GroceryListEntry>> entry : groceryList.entrySet()) {
            for(int i = 0; i < entry.getValue().size(); i++) {
                if(entry.getValue().get(i).contains(item)) {
                    return entry.getKey();
                }
            }
        }
        return "";
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
