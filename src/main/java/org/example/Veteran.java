package org.example;

import org.example.enums.VeteranRanks;

public class Veteran extends Soldier {
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

    public String getPension() {
        return "\n Pension: " + this.pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }

}
