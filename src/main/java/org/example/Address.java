package org.example;

public class Address {
    private String street;
    private String city;
    private String country;

    public Address() {
        this.street = "NOT DEFINED";
        this.city = "NOT DEFINED";
        this.country = "NOT DEFINED";
    }

    public void setAddress(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getAddress() {
        return "\n Street : " + this.street + " City: " + this.city + " Country: " + this.country;
    }
}
