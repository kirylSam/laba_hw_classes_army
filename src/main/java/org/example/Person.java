package org.example;

public abstract class Person {
    private String nameSurname;
    private int age;
    private Address address;

    public Person(String nameSurname, int age) {
        this.nameSurname = nameSurname;
        this.age = age;
        address = new Address();
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address.getAddress();
    }

    public void setAddress(String street, String city, String country) {
        this.address.setAddress(street, city, country);
    }
}
