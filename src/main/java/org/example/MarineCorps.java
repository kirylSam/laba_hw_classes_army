package org.example;

import org.example.enums.NavyRanks;

public class MarineCorps extends Marine {
    private NavyRanks navyRank;
    private int salary;

    public MarineCorps(String name, String surname, String DOB) {
        super(name, surname, DOB);
        this.navyRank = NavyRanks.UNDEFINED;
        this.salary = 0;
    }

    public String getMarineCorpsRank() {
        return "\n Non Commissioned Rank: " + this.navyRank.toString();
    }

    public void setMarineCorpsRank(NavyRanks navyRank) {
        this.navyRank = navyRank;
    }

    public String getSalary() {
        return "\n Salary: " + this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Object of Marine Corps class: " + this.getName() + this.getSurname();
    }
}
