package org.example;

public class Soldier extends Army{
    private Regiment regiment;
    private Rank rank;

    public Soldier(String nameSurname, int age) {
        super(nameSurname, age);
        this.regiment = Regiment.UNDEFINED;
        this.rank = Rank.UNDEFINED;
    }

    public String getRegiment() {
        return "\n Regiment: " + this.regiment.toString();
    }

    public void setRegiment(Regiment regiment) {
        this.regiment = regiment;
    }

    public String getRank() {
        return "\n Rank: " + this.rank.toString();
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
