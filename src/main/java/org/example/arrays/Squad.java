package org.example.arrays;

import org.example.Person;
import org.example.Soldier;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Squad {
    private ArrayList<Soldier> squadArrayList = new ArrayList<>();

    public Squad() {
    }

    public Squad(ArrayList<Soldier> squadArrayList) {
        this.squadArrayList = squadArrayList;
    }

    public ArrayList<Soldier> getSquadArrayList() {
        return this.squadArrayList;
    }

    public void addSoldierToSquad(Soldier soldier) {
        this.squadArrayList.add(soldier);
    }

    public Soldier getSoldierFromSquad(int index) {
        return this.squadArrayList.get(index);
    }

    public void removeSoldierFromSquad(int index) {
        this.squadArrayList.remove(index);
    }
}
