package contacts;
import java.lang.reflect.Array;
import java.util.*;
import java.nio.*;
public class Contacts {
    private ArrayList<Contact> contacts;

    public Contacts() {
        contacts = new ArrayList<>();
    }

    public Contacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setContact(int index, Contact contact) {
        contacts.set(index, contact);
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void addContact(String name, int phoneNumber, String email) {
        this.addContact(new Contact(name, phoneNumber, email));
    }

    public void print() {
        System.out.format("%-20s | Phone Number | Email%n", "Name");
        System.out.println("---------------------------------------------------------------------");
        for(Contact contact : contacts) {
            contact.print();
        }
    }

    public boolean hasContact(String name) {
        for(Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Contact getContact(String name) {
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(name)) {
                return getContact(i);
            }
        }
        return new Contact();
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void removeContact(String name) {
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(name)) {
                removeContact(getContact(i));
            }
        }
    }

    public List<String> toList() {
        List<String> contactsList = new ArrayList<>();
        for (int i = 0; i < contacts.size(); i++) {
            contactsList.add(contacts.get(i).toString());
        }
        return contactsList;
    }

    public Contacts fromList(List<String> list) {
        Contacts contactsList = new Contacts();
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
            contactsList.addContact(new Contact(list.get(i)));
        }
        return contactsList;
    }
}
