package org.gad.phoneApp;

import java.util.ArrayList;

public class Contact {
    private String contactID;
    private String contactNumber;
    private String contactFirstName;
    private String contactLastName;

    private ArrayList<String> receivedMessages;

    Contact(String contactID, String contactNumber, String contactFirstName, String contactLastName){
        this.contactID = contactID;
        this.contactNumber = contactNumber;
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.receivedMessages = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contact ID='" + contactID + '\'' +
                ", Number='" + contactNumber + '\'' +
                ", First Name='" + contactFirstName + '\'' +
                ", Last Name='" + contactLastName + '\'' +
                '}';
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void addReceivedMessage(String receivedMessage) {
        this.receivedMessages.add(receivedMessage);
    }

    public ArrayList<String> getReceivedMessages() {
        return receivedMessages;
    }
}
