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

    public String getStreet() {
        return "\n Street : " + this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return "\n City : " + this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return "\n Country : " + this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
