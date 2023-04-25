package org.example;

import org.example.enums.CommissionedRanks;
import org.example.interfaces.IArmedM4A1;
import org.example.interfaces.IArmyUniform;

public class CommissionedOfficer extends Soldier implements IArmedM4A1, IArmyUniform {

    private CommissionedRanks commissionedRank;
    private String militaryDegree;

    public CommissionedOfficer(String name, String surname, String DOB) {
        super(name, surname, DOB);
        this.commissionedRank = CommissionedRanks.UNDEFINED;
        this.militaryDegree = "UNDEFINED";
    }

    public String getCommissionedRank() {
        return "\n Commissioned Rank: " + this.commissionedRank.toString();
    }

    public void setCommissionedRank(CommissionedRanks commissionedRank) {
        this.commissionedRank = commissionedRank;
    }

    public String getMilitaryDegree() {
        return "\n Military Degree: " + this.militaryDegree;
    }

    public void setMilitaryDegree(String militaryDegree) {
        this.militaryDegree = militaryDegree;
    }

    @Override
    public String toString() {
        return "Object of Commissioned Officer class: " + this.getName() + this.getSurname();
    }

    @Override
    public String showWeapon() {
        return "\n Armed with: " + IArmedM4A1.ASSAULT_RIFLE + ", Pistol: " + IArmedM4A1.PISTOL;
    }

    @Override
    public String showUniform() {
        return "\n Uniform:: " + IArmyUniform.COMBAT_UNIFORM + ", " + IArmyUniform.SERVICE_UNIFORM
                + ", " + IArmyUniform.MESS_UNIFORM + ", " + IArmyUniform.PHYSICAL_TRAINING_UNIFORM;
    }
}
