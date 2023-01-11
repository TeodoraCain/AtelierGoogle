package org.gad.objectContainers;

public class Country {
    private String country;

    public Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return " ,country" +
                "name='" + country + '\'' ;
    }
}
