package org.example;

public class CivilianEmployee extends Person{
    private GeneralScheduleGrade generalScheduleGrade;
    private int salary;
    private String position;

    public CivilianEmployee(String nameSurname, int age) {
        super(nameSurname, age);
        this.generalScheduleGrade = GeneralScheduleGrade.UNDEFINED;
        this.salary = 0;
        this.position = "UNDEFINED";
    }

    public String getGeneralScheduleGrade() {
        return "\n General Schedule Civilian Grade: " + this.generalScheduleGrade.toString();
    }

    public void setGeneralScheduleGrade(GeneralScheduleGrade generalScheduleGrade) {
        this.generalScheduleGrade = generalScheduleGrade;
    }

    public String getSalary() {
        return "\n Salary: " + this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return "\n Position: " + this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
