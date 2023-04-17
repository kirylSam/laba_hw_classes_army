package org.example;

public class Veteran extends Army{
    private Rank rank;

    public Veteran(String nameSurname, int age) {
        super(nameSurname, age);
    }

    public String getRank() {
        return "\n Off Duty. Rank: " + this.rank.toString();
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String getArmyInfo() {
        return "\n No longer on duty. Veteran";
    }
}
