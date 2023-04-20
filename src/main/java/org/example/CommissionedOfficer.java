package org.example;

import org.example.enums.CommissionedRanks;


public class CommissionedOfficer extends Soldier {

    private CommissionedRanks commissionedRank;
    private int salary;

    private String militaryDegree;

    public CommissionedOfficer(String name, String surname, String DOB) {
        super(name, surname, DOB);
        this.commissionedRank = CommissionedRanks.UNDEFINED;
        this.salary = 0;
        this.militaryDegree = "UNDEFINED";
    }

    public String getCommissionedRank() {
        return "\n Commissioned Rank: " + this.commissionedRank.toString();
    }

    public void setCommissionedRank(CommissionedRanks commissionedRank) {
        this.commissionedRank = commissionedRank;
    }

    public String getSalary() {
        return "\n Salary: " + this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getMilitaryDegree() {
        return "\n Military Degree: " + this.militaryDegree;
    }

    public void setMilitaryDegree(String militaryDegree) {
        this.militaryDegree = militaryDegree;
    }
}
