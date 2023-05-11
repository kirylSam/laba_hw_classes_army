package org.example;

import org.example.exceptions.IncorrectDOBFormatException;
import org.example.exceptions.IncorrectNameFormatException;
import org.example.exceptions.IncorrectSurnameFormatException;
import org.example.interfaces.IDateMatcher;
import org.example.interfaces.INameAndSurnameMatcher;

import java.util.regex.Pattern;

public abstract class Person implements IDateMatcher, INameAndSurnameMatcher {
    private String name;
    private String surname;
    private String DOB;
    private Address address;

    private static Pattern DATE_PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
    private static Pattern NAME_PATTERN = Pattern.compile("^[A-Z][a-z]{0,19}$");
    private static Pattern SURNAME_PATTERN = Pattern.compile("^[A-Z][a-z]{1,29}$");


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

    public void setName(String name) throws IncorrectNameFormatException {
        if(!nameMatches(name) || name.length() < 1) {
            throw new IncorrectNameFormatException("The provided name is not formatted correctly. Should be: Xx-x");
        } else {
            this.name = name;
        }
    }

    public String getSurname() {
        return "\n Surname: " + this.surname;
    }

    public void setSurname(String surname) throws IncorrectSurnameFormatException {
        if(!surnameMatches(surname) || surname.length() < 1) {
            throw new IncorrectSurnameFormatException("The provided surname is not formatted correctly. Should be: Xx-x");
        } else {
            this.surname = surname;
        }
    }

    public String getDOB() {
        return "\n DOB: " + this.DOB;
    }

    public void setDOB(String DOB) throws IncorrectDOBFormatException {
        if(!dateMatches(DOB)) {
            throw new IncorrectDOBFormatException("The provided DOB is not formatted correctly. Should be: XXXX-XX-XX");
        } else {
            this.DOB = DOB;
        }
    }

    @Override
    public boolean dateMatches(String DOB) {
        return DATE_PATTERN.matcher(DOB).matches();
    }

    @Override
    public boolean nameMatches(String name) {
        return NAME_PATTERN.matcher(name).matches();
    }

    @Override
    public boolean surnameMatches(String surname) {
        return SURNAME_PATTERN.matcher(surname).matches();
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

        //Now we can compare the data members
        Person other = (Person) o;
        return DOB.equals(other.DOB) && surname.equals(other.surname) && name.equals(other.name);
    }
}
