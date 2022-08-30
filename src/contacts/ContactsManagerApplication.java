package contacts;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class ContactsManagerApplication {
    private static final Input inpt = new Input();
    private static Contacts contacts;
    private static String directory;
    private static String filename;
    private static Path dataDirectory;
    private static Path dataFile;

    public static void createDirectoryAndFile() {
        directory = "data";
        filename = "contacts.txt";

        try {
            dataDirectory = Paths.get(directory);
            dataFile = Paths.get(directory, filename);

            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (Files.notExists(dataFile)) {
                Files.createFile(dataFile);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void loadContactList() {
        createDirectoryAndFile();
        contacts = new Contacts();
        try {
            contacts = contacts.fromList(Files.readAllLines(dataFile));
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void saveContactList() {
        try {
            Files.write(dataFile, contacts.toList());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
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
        Contact newContact = getUserContact();
        if(!contacts.hasContact(newContact.getName())) {
            contacts.addContact(newContact);
        } else if (inpt.yesNo(newContact.getName() + " already exists on this list. Would you like to replace them? Y|N: ")){
            replaceContact(newContact);
        } else {
            addContact();
        }
    }

    public static void addContact(String name) {
        contacts.addContact(getUserContact(name));
    }

    public static void replaceContact(Contact contact) {
        contacts.removeContact(contact.getName());
        contacts.addContact(contact);
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
        Long phoneNumber = inpt.getPhoneNumber("Enter phone number (xxxxxxx or xxxxxxxxxx format): ");
        String email = inpt.getString("Enter email: ");
        return new Contact(name, phoneNumber, email);
    }

    public static Contact getUserContact(String name) {
        long phoneNumber = inpt.getPhoneNumber("Enter phone number (xxxxxxx or xxxxxxxxxx format): ");
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
        if(inpt.yesNo("Would you like to save the changes you made to the Contact List? Y|N: ")) {
            saveContactList();
        }
    }
}
