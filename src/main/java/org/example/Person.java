package org.example;

public abstract class Person {
    private String name;
    private String surname;
    private String DOB;
    private Address address;

    public Person(String name, String surname, String DOB) {
        this.name = name;
        this.surname = surname;
        this.DOB = DOB;
        address = new Address();
    }

    public String getName() {
        return "\n Name: " + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return "\n Surname: " + this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDOB() {
        return "\n DOB: " + this.DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return this.address.getAddress();
    }

    public void setAddress(String street, String city, String country) {
        this.address.setAddress(street, city, country);
    }
}
