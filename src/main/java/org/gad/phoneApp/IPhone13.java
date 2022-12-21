package org.gad.phoneApp;

public class IPhone13 extends Apple {
    private final String imei = String.valueOf(imeiCount++);
    private int battery = this.batteryLife + 13;

    @Override
    public void sendMessage(String contactNumber, String message) {
        if (this.battery >= 1) {
            boolean contactExists = false;

            if (message.length() > 100) {
                System.out.println("Max number of characters exceeded.");
                message = message.substring(0, 100);
            }
            for (Contact contact : this.addressBook) {
                if (contact.getContactNumber().equals(contactNumber)) {
                    contact.addReceivedMessage(message);
                    contactExists = true;
                    battery = battery - 2;
                    break;
                }
            }

            if (!contactExists) {
                System.out.println("Contact number does not exist in the address book!");
            } else {
                System.out.println("New message sent to " + contactNumber + " from your IPhone13."+
                        "\nBattery left : " + battery);

            }
        } else {
            System.out.println("Not enough battery left.");
        }
    }

    @Override
    public void call(String contactNumber) {
        if (battery >= 2) {
            callHistory.add(contactNumber);
            battery = battery - 3;
            System.out.println("Calling " + contactNumber + " from your IPhone13." +
                    "\nBattery left : " + battery);
        } else {
            System.out.println("Not enough battery left.");
        }
    }

}
