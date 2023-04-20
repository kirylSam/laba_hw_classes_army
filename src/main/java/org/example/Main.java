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
        newVeteran.setVeteranRank(VeteranRanks.CAPTAIN);
        newVeteran.setCombatantCommand(CombatantCommands.US_ARMY_CYBERCOMMAND, CommandHQs.WEISBADEN);
        newVeteran.setArmyComponent(ArmyComponents.ARMY_RESERVE);
        newVeteran.setRegiment(ArmyRegiments.RANGER_REGIMENT);
        newVeteran.setPension(100000);
        System.out.println(newVeteran.getName() + newVeteran.getSurname() + newVeteran.getDOB()
                + newVeteran.getAddress() + newVeteran.getVeteranRank()
                + newVeteran.getCombatantCommand() + newVeteran.getArmyComponent()
                + newVeteran.getRegiment() + newVeteran.getPension());

        System.out.println("Let's create a commissioned officer!");
        CommissionedOfficer commissionedOfficer = new CommissionedOfficer("Karen", "Fillippeli", "31/01/2022");
        System.out.println(commissionedOfficer.getName() + commissionedOfficer.getSurname() + commissionedOfficer.getDOB()
                + commissionedOfficer.getAddress() + commissionedOfficer.getCommissionedRank()
                + commissionedOfficer.getCombatantCommand() + commissionedOfficer.getArmyComponent()
                + commissionedOfficer.getRegiment() + commissionedOfficer.getSalary()
                + commissionedOfficer.getMilitaryDegree());

        System.out.println("Let's add data to this commissioned officer!");
        commissionedOfficer.setAddress("32nd angels", "Portland", "US");
        commissionedOfficer.setCommissionedRank(CommissionedRanks.MAJOR);
        commissionedOfficer.setCombatantCommand(CombatantCommands.US_ARMY_AFRICA, CommandHQs.FORT_SAM_HOUSTON);
        commissionedOfficer.setArmyComponent(ArmyComponents.REGULAR_ARMY);
        commissionedOfficer.setRegiment(ArmyRegiments.CAVALRY_REGIMENT);
        commissionedOfficer.setSalary(140000);
        commissionedOfficer.setMilitaryDegree("Marines College");
        System.out.println(commissionedOfficer.getName() + commissionedOfficer.getSurname() + commissionedOfficer.getDOB()
                + commissionedOfficer.getAddress() + commissionedOfficer.getCommissionedRank()
                + commissionedOfficer.getCombatantCommand() + commissionedOfficer.getArmyComponent()
                + commissionedOfficer.getRegiment() + commissionedOfficer.getSalary()
                + commissionedOfficer.getMilitaryDegree());


        System.out.println("Let's create a non commissioned officer!");
        NonCommissionedOfficer nonCommissionedOfficer = new NonCommissionedOfficer("Kiryl", "Sam", "31/09/2021");
        System.out.println(nonCommissionedOfficer.getName() + nonCommissionedOfficer.getSurname() + nonCommissionedOfficer.getDOB()
                + nonCommissionedOfficer.getAddress() + nonCommissionedOfficer.getNonCommissionedRank()
                + nonCommissionedOfficer.getCombatantCommand() + nonCommissionedOfficer.getArmyComponent()
                + nonCommissionedOfficer.getRegiment() + nonCommissionedOfficer.getSalary());

        System.out.println("Let's add data to this non commissioned officer!");
        nonCommissionedOfficer.setAddress("Aboba", "Washington", "US");
        nonCommissionedOfficer.setNonCommissionedRank(NonCommissionedRanks.SPECIALIST);
        nonCommissionedOfficer.setCombatantCommand(CombatantCommands.US_ARMY_AFRICA, CommandHQs.HAWAII);
        nonCommissionedOfficer.setArmyComponent(ArmyComponents.REGULAR_ARMY);
        nonCommissionedOfficer.setRegiment(ArmyRegiments.FIRST_INFANTRY_REGIMENT);
        nonCommissionedOfficer.setSalary(200000);
        System.out.println(nonCommissionedOfficer.getName() + nonCommissionedOfficer.getSurname() + nonCommissionedOfficer.getDOB()
                + nonCommissionedOfficer.getAddress() + nonCommissionedOfficer.getNonCommissionedRank()
                + nonCommissionedOfficer.getCombatantCommand() + nonCommissionedOfficer.getArmyComponent()
                + nonCommissionedOfficer.getRegiment() + nonCommissionedOfficer.getSalary());

        System.out.println("Let's create a marine officer!");
         MarineCorps marineCorps = new MarineCorps("Carol", "Hobbit", "31/09/2000");
        System.out.println(marineCorps.getName() + marineCorps.getSurname() + marineCorps.getDOB()
                + marineCorps.getAddress() + marineCorps.getMarineCorpsRank()
                + marineCorps.getFleet() + marineCorps.getSalary());

        System.out.println("Let's add data to this marine officer!");
        marineCorps.setAddress("Antique", "Washington", "US");
        marineCorps.setMarineCorpsRank(NavyRanks.ADMIRAL);
        marineCorps.setCombatantCommand(CombatantCommands.US_ARMY_CENTRAL, CommandHQs.HAWAII);
        marineCorps.setFleet(Fleets.US_PACIFIC_FLEET);
        marineCorps.setSalary(250000);
        System.out.println(marineCorps.getName() + marineCorps.getSurname() + marineCorps.getDOB()
                + marineCorps.getAddress() + marineCorps.getMarineCorpsRank()
                + marineCorps.getFleet() + marineCorps.getSalary());

        System.out.println("Let's create a navy reservist!");
        MarineReserve marineReserve = new MarineReserve("Navy", "Vet", "31/09/2000");
        System.out.println(marineReserve.getName() + marineReserve.getSurname() + marineReserve.getDOB()
                + marineReserve.getAddress() + marineReserve.getMarineReserveRank()
                + marineReserve.getFleet() + marineReserve.getPension());

        System.out.println("Let's add data to navy reservist!");
        marineReserve.setAddress("Antantae", "Seattle", "US");
        marineReserve.setMarineReserveRank(NavyRanks.ADMIRAL);
        marineReserve.setCombatantCommand(CombatantCommands.US_ARMY_CENTRAL, CommandHQs.HAWAII);
        marineReserve.setFleet(Fleets.US_PACIFIC_FLEET);
        marineReserve.setPension(50000);
        System.out.println(marineReserve.getName() + marineReserve.getSurname() + marineReserve.getDOB()
                + marineReserve.getAddress() + marineReserve.getMarineReserveRank()
                + marineReserve.getFleet() + marineReserve.getPension());
    }
    
}