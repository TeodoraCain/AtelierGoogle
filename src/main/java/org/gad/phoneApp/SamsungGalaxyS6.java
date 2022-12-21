package org.gad.phoneApp;

import java.awt.*;
import java.util.Objects;

public class SamsungGalaxyS6 extends Samsung {


    private final String imei = String.valueOf(imeiCount++);
    private int battery = this.batteryLife;

    public SamsungGalaxyS6() {
    }

    public SamsungGalaxyS6(String material, Color color) {
        this.color = color;
        this.material = material;
    }

    @Override
    public void sendMessage(String contactNumber, String message) {
        if (this.battery >= 1) {
            boolean contactExists = false;

            if (message.length() > 100) {
                System.out.println("Max number of characters exceeded.");
                message = message.substring(0, 100);
            }
            for (Contact contact : this.addressBook) {
                if (Objects.equals(contact.getContactNumber(), contactNumber)) {
                    contact.addReceivedMessage(message);
                    contactExists = true;
                    battery--;
                    break;
                }
            }

            if (!contactExists) {
                System.out.println("Contact number does not exist in the address book!");
            } else {
                System.out.println("New message sent to " + contactNumber + " from your Samsung Galaxy S6." +
                        "\nBattery left : " + battery);
            }
        } else {
            System.out.println("Not enough battery left.");
        }
    }

    @Override
    public void call(String contactNumber) {
        if (battery >= 2) {
            this.callHistory.add(contactNumber);
            battery = battery - 2;
            System.out.println("Calling " + contactNumber + " from your Samsung Galaxy S6." +
                    "\nBattery left : " + battery);
        } else {
            System.out.println("Not enough battery left.");
        }
    }
}