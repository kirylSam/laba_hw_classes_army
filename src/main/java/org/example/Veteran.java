package org.example;

import org.example.enums.VeteranRanks;
import org.example.interfaces.IPensioner;
import org.example.interfaces.IStorable;

public class Veteran extends Soldier implements IPensioner, IStorable {
    private VeteranRanks veteranRank;
    private int pension;

    public Veteran(String name, String surname, String DOB) {
        super(name, surname, DOB);
        this.veteranRank = VeteranRanks.UNDEFINED;
        this.pension = 0;
    }

    public String getVeteranRank() {
        return "\n Off Duty. Rank: " + this.veteranRank.toString();
    }

    public void setVeteranRank(VeteranRanks veteranRank) {
        this.veteranRank = veteranRank;
    }

    @Override
    public String getPension() {
        return "\n Pension: " + this.pension;
    }

    @Override
    public void setPension(int pension) {
        this.pension = pension;
    }

    @Override
    public String toString() {
        return "Object of Veteran class: " + this.getName() + this.getSurname();
    }

    @Override
    public String prepareInfo() {
        return this.getName() + this.getSurname() + this.getDOB()
                + this.getAddress() + this.getVeteranRank()
                + this.getCombatantCommand() + this.getArmyComponent()
                + this.getRegiment() + this.getPension()
                + this.getMilitaryOccupationalCode();
    }
}
