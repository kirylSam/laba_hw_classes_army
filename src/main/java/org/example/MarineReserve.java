package org.example;

import org.example.enums.NavyRanks;
import org.example.interfaces.IPensioner;

public class MarineReserve extends Marine implements IPensioner {
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
        return "Object of Marine Reserve class: " + this.getName() + this.getSurname();
    }
}
