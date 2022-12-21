package org.gad.phoneApp;

public class Main {

    public static void main(String[] args) {
        //Phone phone= new Samsung(); // shouldn't compile
        Phone phone = new SamsungGalaxyS6();
        Phone phone14 = new IPhone14();

        phone.addContact("1", "0777548458", "James", "Holden");
        phone.addContact("2", "0777548459", "Louis", "Evans");
        phone.listContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendMessage("0777548458",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do " +
                        "eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim " +
                        "ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
                        "aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                        "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla " +
                        "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa " +
                        "qui officia deserunt mollit anim id est laborum.");
        phone.sendMessage("0777548458", "hello");
        phone.sendMessage("0777548458", "hi");
        phone.listMessages("0777548458");

        // send a message to the second contact from the previous listed
        phone.call("0777548458");
        phone.call("0777548458");
        phone.viewHistory();

        phone14.addContact("1", "0777548458", "James", "Holden");
        phone14.addContact("2", "0777548459", "Louis", "Evans");
        phone14.listContacts();

        phone14.sendMessage("0777548458", "hello");
        phone14.call("0777548459");

    }

}
