package contacts;
import java.util.*;
public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact() {
        name = "";
        phoneNumber = "";
        email = "";
    }

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print() {
        System.out.format("%-20s | %12s | %s%n", name, phoneNumber, email);
    }
}
