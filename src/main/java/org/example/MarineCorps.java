package org.example;

import org.example.enums.NavyRanks;
import org.example.interfaces.*;

public class MarineCorps extends Marine implements IArmedM27, IMarinesUniform, IStorable {
    private NavyRanks navyRank;

    public MarineCorps(String name, String surname, String DOB) {
        super(name, surname, DOB);
        this.navyRank = NavyRanks.UNDEFINED;
    }

    public String getMarineCorpsRank() {
        return "\n Non Commissioned Rank: " + this.navyRank.toString();
    }

    public void setMarineCorpsRank(NavyRanks navyRank) {
        this.navyRank = navyRank;
    }

    @Override
    public String toString() {
        return "Object of Marine Corps class: " + this.getName() + this.getSurname();
    }

    @Override
    public String showWeapon() {
        return "\n Armed with: " + IArmedM4A1.ASSAULT_RIFLE + ", Pistol: " + IArmedM4A1.PISTOL;
    }

    @Override
    public String showUniform() {
        return "\n Uniform:: " + IMarinesUniform.COMBAT_UNIFORM + ", " + IMarinesUniform.SERVICE_UNIFORM
                + ", " + IMarinesUniform.MESS_UNIFORM + ", " + IMarinesUniform.PHYSICAL_TRAINING_UNIFORM;
    }

    @Override
    public String prepareInfo() {
        return this.getName() + this.getSurname() + this.getDOB()
                + this.getAddress() + this.getMarineCorpsRank()
                + this.getFleet() + this.getSalary() +this.showUniform();
    }
}
