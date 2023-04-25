package org.example;

import org.example.enums.NonCommissionedRanks;
import org.example.interfaces.IArmedM4A1;
import org.example.interfaces.IArmyUniform;

public class NonCommissionedOfficer extends Soldier implements IArmedM4A1, IArmyUniform {
    private NonCommissionedRanks nonCommissionedRank;

    public NonCommissionedOfficer(String name, String surname, String DOB) {
        super(name, surname, DOB);
        this.nonCommissionedRank = NonCommissionedRanks.UNDEFINED;
    }

    public String getNonCommissionedRank() {
        return "\n Non Commissioned Rank: " + this.nonCommissionedRank.toString();
    }

    public void setNonCommissionedRank(NonCommissionedRanks nonCommissionedRank) {
        this.nonCommissionedRank = nonCommissionedRank;
    }

    @Override
    public String toString() {
        return "Object of NonCommissioned Officer class: " + this.getName() + this.getSurname();
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
