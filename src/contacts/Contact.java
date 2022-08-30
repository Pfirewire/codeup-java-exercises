package contacts;
import java.util.*;
public class Contact {
    private String name;
    private int phoneNumber;
    private String email;

    public Contact() {
        name = "";
        phoneNumber = 0;
        email = "";
    }

    // constructor to create Contact based off String with our unique divider
    public Contact(String fileLine) {
        String[] lineComponents = fileLine.split("@:@");
        name = lineComponents[0];
        phoneNumber = Integer.valueOf(lineComponents[1]);
        email = lineComponents[2];
    }

    public Contact(String name, int phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print() {
        System.out.format("%-20s | %12s | %s%n", name, formatPhoneNumber(phoneNumber), email);
    }

    public String formatPhoneNumber(int phoneNumber) {
        String formattedNumber = new String();
        String uglyNumber = Integer.toString(phoneNumber);
        if(uglyNumber.length() > 7){
            for(int i = 0; i < uglyNumber.length(); i++) {
                formattedNumber += uglyNumber.charAt(i);
                if(i == 2 || i == 5) {
                    formattedNumber += "-";
                }
            }
        } else {
            for(int i = 0; i < uglyNumber.length(); i++) {
                formattedNumber += uglyNumber.charAt(i);
                if(i == 2) {
                    formattedNumber += "-";
                }
            }
        }
        return formattedNumber;
    }

    // converts a Contact to a String with a unique divider string "@:@"
    public String toString() {
        return name + "@:@" + phoneNumber + "@:@" + email;
    }
}
