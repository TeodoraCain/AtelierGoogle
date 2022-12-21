package org.gad.phoneApp;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Apple implements Phone {

    protected static long imeiCount = 222_222_222_222_222L;
    protected final int batteryLife = 50;
    protected Color color;
    protected String material;
    protected ArrayList<String> callHistory = new ArrayList<>();
    protected ArrayList<Contact> addressBook = new ArrayList<>();

    @Override
    public void addContact(String contactID, String contactNumber, String contactFirstName, String contactLastName) {
        Contact newContact = new Contact(contactID, contactNumber, contactFirstName, contactLastName);
        addressBook.add(newContact);
        System.out.println(contactNumber + " added to address book");
    }

    @Override
    public void listContacts() {
        System.out.println("The following contacts are in your address book:");
        addressBook.forEach(System.out::println);
    }

    @Override
    public void listMessages(String contactNumber) {
        boolean contactExists = false;
        System.out.println("Listing messages from " + contactNumber);
        for (Contact contact : addressBook) {
            if (Objects.equals(contact.getContactNumber(), contactNumber)) {
                ArrayList<String> receivedMessages = contact.getReceivedMessages();
                for (String message : receivedMessages) {
                    System.out.println("\n" + message);
                }
                contactExists = true;
                break;
            }
        }
        if (!contactExists) {
            System.out.println("Could not find contact " + contactNumber + "in your address book.");
        }
    }

    @Override
    public void viewHistory() {
        System.out.println("Listing call log ...");
        for (int i = 0; i < callHistory.size(); i++) {
            System.out.println((i + 1) + ". " + callHistory.get(i));
        }
    }
}
