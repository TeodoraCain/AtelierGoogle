package org.gad.objectContainers;

import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<Address> addressList;

    public Hobby(String name, int frequency, List<Address> addressList) {
        this.name = name;
        this.frequency = frequency;
        this.addressList = addressList;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", addressList=" + addressList +
                '}';
    }
}
