package org.gad.phoneApp;

public interface Phone {

    void addContact(String contactID, String contactNumber, String contactFirstName, String contactLastName );
    void listContacts();
    void sendMessage(String contactNumber, String message);
    void listMessages(String contactNumber);
    void call(String contactNumber);
    void viewHistory();

}
