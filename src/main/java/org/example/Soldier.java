package org.example;

import org.example.enums.ArmyComponents;
import org.example.enums.ArmyRegiments;
import org.example.enums.CombatantCommands;
import org.example.enums.CommandHQs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soldier extends Person{
    private CombatantCommand combatantCommand;
    private ArmyComponents armyComponent;
    private ArmyRegiments armyRegiment;
    private int salary;

    //static list
    private static final List<String> mosCodes;

    private String militaryOccupationalCode;

    public Soldier(String name, String surname, String DOB) {
        super(name, surname, DOB);
        combatantCommand = new CombatantCommand();
        this.armyComponent = ArmyComponents.UNDEFINED;
        this.armyRegiment = ArmyRegiments.UNDEFINED;
        this.salary = 0;
        this.militaryOccupationalCode = mosCodes.get(0);
    }

    //static block
    static {
        List<String> temporaryList = new ArrayList<>();
        temporaryList.add("MOS 0 - NOT DEFINED");
        temporaryList.add("MOS 1 - Operations");
        temporaryList.add("MOS 2 - Logistics and Maintenance");
        temporaryList.add("MOS 3 - Support");
        temporaryList.add("MOS 4 - Medical");
        temporaryList.add("MOS 5 - Professional");
        temporaryList.add("MOS 6 - Acquisition");
        temporaryList.add("MOS 7 - Special Investigations");
        temporaryList.add("MOS 8 - Special Duty");
        temporaryList.add("MOS 9 - Transition state");
        mosCodes = Collections.unmodifiableList(temporaryList);
    }

    public String getCombatantCommand() {
        return this.combatantCommand.getCombatantCommand() + this.combatantCommand.getCommandHQ();
    }
    public void setCombatantCommand(CombatantCommands combatantCommand, CommandHQs commandHQ) {
        this.combatantCommand.setCombatantCommand(combatantCommand);
        this.combatantCommand.setCommandHQ(commandHQ);
    }

    public String getArmyComponent() {
        return "\n ArmyComponent: " + this.armyComponent.toString();
    }

    public void setArmyComponent(ArmyComponents armyComponents) {
        this.armyComponent = armyComponents;
    }

    public String getRegiment() {
        return "\n Regiment: " + this.armyRegiment.toString();
    }

    public void setRegiment(ArmyRegiments armyRegiments) {
        this.armyRegiment = armyRegiments;
    }

    public String getSalary() {
        return "\n Salary: " + this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static List<String> getListOfMosCodes() {
        return mosCodes;
    }

    public static String getOneMosCode(int mosOccupationalCodeID) {
        return mosCodes.get(mosOccupationalCodeID);
    }

    public String getMilitaryOccupationalCode() {
        return "\n Military Occupational Speciality Code: " + this.militaryOccupationalCode;
    }

    public void setMilitaryOccupationalCode(int mosOccupationalCodeID) {
        this.militaryOccupationalCode = mosCodes.get(mosOccupationalCodeID);
    }
}
