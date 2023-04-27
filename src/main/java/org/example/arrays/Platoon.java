package org.example.arrays;

import org.example.Soldier;

import java.util.ArrayList;

public class Platoon {
    private ArrayList<Squad> platoonArrayList = new ArrayList<>();

    public Platoon() {
    }

    public Platoon(ArrayList<Squad> platoonArrayList) {
        this.platoonArrayList = platoonArrayList;
    }

    public ArrayList<Squad> getPlatoonArrayList() {
        return this.platoonArrayList;
    }

    public void addSquadToPlatoon(Squad squad) {
        this.platoonArrayList.add(squad);
    }

    public Squad getSquadFromPlatoon(int index) {
        return this.platoonArrayList.get(index);
    }

    public void removeSquadFromPlatoon(int index) {
        this.platoonArrayList.remove(index);
    }
}
