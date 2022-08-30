package contacts;
import util.Input;
import java.util.*;
public class ContactsManagerApplication {
    private static final Input inpt = new Input();
    private static Contacts contacts;

    public static void loadContactList() {
        contacts = new Contacts();
        contacts.addContact("Bob Bobson", "341-555-4345", "bob.bobby@email.com");
        contacts.addContact("Judy Erin", "123-555-7537", "juuuuuuudeeeeee@email.com");
    }

    public static void saveContactList() {

    }

    public static void printCLMenu() {
        System.out.println("\n------------------------------------------------\n" +
                "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "0. Exit.\n" +
                "------------------------------------------------\n");
    }

    public static int getCLOption() {
        return inpt.getInt(0, 4, "Enter Option: ");
    }

    public static boolean doCLOption(int userOption) {
        switch (userOption) {
            case 0:
                return false;
            case 1:
                viewContacts();
                break;
            case 2:
                addContact();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                deleteContact();
                break;
        }
        return true;
    }

    public static void viewContacts() {
        contacts.print();
    }

    public static void addContact() {
        contacts.addContact(getUserContact());
    }

    public static void addContact(String name) {
        contacts.addContact(getUserContact(name));
    }

    public static void searchContact() {
        String userName = getUserContactName();
        if(contacts.hasContact(userName)){
            contacts.getContact(userName).print();
        } else {
            if (inpt.yesNo(userName + " does not exist on this list. Would you like to add them? Y|N: ")){
                addContact(userName);
            }
        }
    }

    public static void deleteContact() {
        String userName = getUserContactName();
        if(contacts.hasContact(userName)){
            contacts.removeContact(userName);
        } else {
            System.out.println(userName + " does not exist on the list.");
        }
    }

    public static Contact getUserContact() {
        String name = inpt.getString("Enter name: ");
        String phoneNumber = inpt.getString("Enter phone number (xxx-xxx-xxxx format): ");
        String email = inpt.getString("Enter email: ");
        return new Contact(name, phoneNumber, email);
    }

    public static Contact getUserContact(String name) {
        String phoneNumber = inpt.getString("Enter phone number (xxx-xxx-xxxx format): ");
        String email = inpt.getString("Enter email: ");
        return new Contact(name, phoneNumber, email);
    }

    public static String getUserContactName() {
        return inpt.getString("Enter contact name: ");
    }

    public static void main(String[] arg) {
        loadContactList();

        boolean willContinue;
        do {
            printCLMenu();
            willContinue = doCLOption(getCLOption());
        } while (willContinue);
    }
}
