package org.gad.objectContainers;

public class Address extends Country {
    private String street;
    private int number;

    public Address(String street, int number, String country) {
        super(country);
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                super.toString() +
                '}';
    }
}
