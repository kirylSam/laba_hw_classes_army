package org.example;

import org.example.enums.GeneralScheduleGrades;

public class CivilianEmployee extends Person{
    private GeneralScheduleGrades generalScheduleGrade;
    private int salary;
    private String position;

    public CivilianEmployee(String name, String surname, String DOB) {
        super(name, surname, DOB);
        this.generalScheduleGrade = GeneralScheduleGrades.UNDEFINED;
        this.salary = 0;
        this.position = "UNDEFINED";
    }

    public String getGeneralScheduleGrade() {
        return "\n General Schedule Civilian Grade: " + this.generalScheduleGrade.toString();
    }

    public void setGeneralScheduleGrade(GeneralScheduleGrades generalScheduleGrades) {
        this.generalScheduleGrade = generalScheduleGrades;
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

    @Override
    public String toString() {
        return "Object of Civilian class: " + this.getName() + this.getSurname();
    }
}
