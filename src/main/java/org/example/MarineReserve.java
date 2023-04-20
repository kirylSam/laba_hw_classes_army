package org.example;

import org.example.enums.NavyRanks;

public class MarineReserve extends Marine {
    private NavyRanks navyRank;
    private int pension;

    public MarineReserve(String name, String surname, String DOB) {
        super(name, surname, DOB);
        this.navyRank = NavyRanks.UNDEFINED;
        this.pension = 0;
    }

    public String getMarineReserveRank() {
        return "\n Off Duty. Rank: " + this.navyRank.toString();
    }

    public void setMarineReserveRank(NavyRanks navyRank) {
        this.navyRank = navyRank;
    }

    public String getPension() {
        return "\n Pension: " + this.pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }

}
