package org.example;

public abstract class Person {
    private String name;
    private String surname;
    private String DOB;
    private Address address;

    private static int numberOfPeople;

    public Person(String name, String surname, String DOB) {
        this.name = name;
        this.surname = surname;
        this.DOB = DOB;
        address = new Address();
        numberOfPeople++;
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

    public static String getNumberOfPeople() {
        return "\n Total Number of People created: " + numberOfPeople;
    }

    public static void setNumberOfPeople(int modifiedNumberOfPeople) {
        numberOfPeople = modifiedNumberOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        //if the object is null or is not of this class - return false;
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        //if the object is not an instance of Person class
        if(!(o instanceof Person)) {
            return false;
        }
        //if the object is compared with itself - return true
        if (o == this) {
            return true;
        }

        //No we can compare the data members
        Person other = (Person) o;
        return DOB.equals(other.DOB) && surname.equals(other.surname) && name.equals(other.name);
    }
}
