package org.example;

import org.example.enums.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's create a veteran!");
        Veteran newVeteran = new Veteran("Alex", "Johns", "31/02/1990");
        System.out.println(newVeteran.getName() + newVeteran.getSurname() + newVeteran.getDOB()
                + newVeteran.getAddress() + newVeteran.getVeteranRank()
                + newVeteran.getCombatantCommand() + newVeteran.getArmyComponent()
                + newVeteran.getRegiment() + newVeteran.getPension());

        System.out.println("Let's add data to this veteran!");
        newVeteran.setAddress("Downing", "Maine", "US");
        newVeteran.setVeteranRank(VeteranRanks.Captain);
        newVeteran.setCombatantCommand(CombatantCommands.USArmyCyberCommand, CommandHQs.Weisbaden);
        newVeteran.setArmyComponent(ArmyComponents.ArmyReserve);
        newVeteran.setRegiment(ArmyRegiments.RangerRegiment);
        newVeteran.setPension(100000);
        System.out.println(newVeteran.getName() + newVeteran.getSurname() + newVeteran.getDOB()
                + newVeteran.getAddress() + newVeteran.getVeteranRank()
                + newVeteran.getCombatantCommand() + newVeteran.getArmyComponent()
                + newVeteran.getRegiment() + newVeteran.getPension());
    }
    
}