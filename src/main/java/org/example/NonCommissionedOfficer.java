package org.example;

import org.example.enums.NonCommissionedRanks;

public class NonCommissionedOfficer extends Soldier {

    private NonCommissionedRanks nonCommissionedRank;
    private int salary;

    public NonCommissionedOfficer(String name, String surname, String DOB) {
        super(name, surname, DOB);
        this.nonCommissionedRank = NonCommissionedRanks.UNDEFINED;
        this.salary = 0;
    }

    public String getNonCommissionedRank() {
        return "\n Non Commissioned Rank: " + this.nonCommissionedRank.toString();
    }

    public void setNonCommissionedRank(NonCommissionedRanks nonCommissionedRank) {
        this.nonCommissionedRank = nonCommissionedRank;
    }

    public String getSalary() {
        return "\n Salary: " + this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
