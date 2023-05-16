package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.archiver.ReadFileAndCalculateUniqueWords;
import org.example.arrays.LinkedList;
import org.example.arrays.Platoon;
import org.example.arrays.Squad;
import org.example.connectionPool.SimulateCollectionPoolUsage;
import org.example.enums.*;
import org.example.exceptions.*;
import org.example.archiver.Archiver;
import org.example.lambdas.LambdaFunctions;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("org.example.Main");

     /*   Veteran newVeteran = new Veteran("Alex", "Johns", "1990-02-19");
        logger.info(newVeteran.prepareInfo());

        newVeteran.setAddress("Downing", "Maine", "US");
        newVeteran.setVeteranRank(VeteranRanks.CAPTAIN);
        newVeteran.setCombatantCommand(CombatantCommands.US_ARMY_CYBERCOMMAND, CommandHQs.WEISBADEN);
        newVeteran.setArmyComponent(ArmyComponents.ARMY_RESERVE);
        newVeteran.setRegiment(ArmyRegiments.RANGER_REGIMENT);
        newVeteran.setPension(100000);
        newVeteran.setMilitaryOccupationalCode(4);
        logger.info(newVeteran.prepareInfo());

        CommissionedOfficer commissionedOfficer = new CommissionedOfficer("Karen", "Fillippeli", "2000-01-20");
        commissionedOfficer.setAddress("32nd angels", "Portland", "US");
        commissionedOfficer.setCommissionedRank(CommissionedRanks.MAJOR);
        commissionedOfficer.setCombatantCommand(CombatantCommands.US_ARMY_AFRICA, CommandHQs.FORT_SAM_HOUSTON);
        commissionedOfficer.setArmyComponent(ArmyComponents.REGULAR_ARMY);
        commissionedOfficer.setRegiment(ArmyRegiments.CAVALRY_REGIMENT);
        commissionedOfficer.setSalary(140000);
        commissionedOfficer.setMilitaryDegree("Marines College");
        commissionedOfficer.setMilitaryOccupationalCode(6);
        logger.info(commissionedOfficer.prepareInfo());


        NonCommissionedOfficer nonCommissionedOfficer = new NonCommissionedOfficer("Kiryl", "Sam", "2000-01-20");
        nonCommissionedOfficer.setAddress("Aboba", "Washington", "US");
        nonCommissionedOfficer.setNonCommissionedRank(NonCommissionedRanks.SPECIALIST);
        nonCommissionedOfficer.setCombatantCommand(CombatantCommands.US_ARMY_AFRICA, CommandHQs.HAWAII);
        nonCommissionedOfficer.setArmyComponent(ArmyComponents.REGULAR_ARMY);
        nonCommissionedOfficer.setRegiment(ArmyRegiments.FIRST_INFANTRY_REGIMENT);
        nonCommissionedOfficer.setSalary(200000);
        logger.info(nonCommissionedOfficer.prepareInfo());


        MarineCorps marineCorps = new MarineCorps("Carol", "Hobbit", "2008-01-20");
        marineCorps.setAddress("Antique", "Washington", "US");
        marineCorps.setMarineCorpsRank(NavyRanks.ADMIRAL);
        marineCorps.setCombatantCommand(CombatantCommands.US_ARMY_CENTRAL, CommandHQs.HAWAII);
        marineCorps.setFleet(Fleets.US_PACIFIC_FLEET);
        marineCorps.setSalary(250000);
        logger.info(marineCorps.prepareInfo());


        MarineReserve marineReserve = new MarineReserve("Navy", "Vet", "1990-02-30");
        marineReserve.setAddress("Antantae", "Seattle", "US");
        marineReserve.setMarineReserveRank(NavyRanks.ADMIRAL);
        marineReserve.setCombatantCommand(CombatantCommands.US_ARMY_CENTRAL, CommandHQs.HAWAII);
        marineReserve.setFleet(Fleets.US_PACIFIC_FLEET);
        marineReserve.setPension(50000);
        logger.info(marineReserve.prepareInfo());

        logger.info("Using equals:");
        logger.info(marineReserve.equals(marineReserve));
        logger.info(marineCorps.equals(marineReserve));
        MarineReserve marineReserve1 = marineReserve;
        logger.info(marineReserve1.equals(marineReserve));


        logger.info("Let's how many people we've created:");
        logger.info(Person.getNumberOfPeople());

        logger.info("Each soldier can have some Military Occupational Code - it's a static list");
        for (String occupationalCode: Soldier.getListOfMosCodes()) {
            logger.info(occupationalCode);
        }

        try {
            Archiver.addInfoToTheArchiveFile("veteran.txt", newVeteran.prepareInfo());
        } catch (IncorrectFileNameException e) {
            logger.error("[EXCEPTION] Incorrect filename. It should be at least 5 characters long and with .txt extension");
        } catch (IncorrectInfoToBeAddedException e) {
            logger.error("[EXCEPTION] Incorrect string to be added. Either shorter than 2 or longer than 10000 characters");
        }


        try {
            marineCorps.setDOB("10/10/100");
        } catch (IncorrectDOBFormatException e) {
            logger.error("[EXCEPTION] Incorrect date format. Should be XXXX-XX-XX");
        }
        logger.info(marineCorps.getDOB());

        try {
            marineCorps.setName("a");
        } catch (IncorrectNameFormatException e) {
            logger.error("[EXCEPTION] Incorrect name format. Should be: Xx-x");
        }

        try {
            marineCorps.setSurname("bbb");
        } catch (IncorrectSurnameFormatException e) {
            logger.error("[EXCEPTION] Incorrect name format. Should be: Xx-x");
        }

        Squad squad1 = new Squad();
        squad1.addSoldierToSquad(newVeteran);
        squad1.addSoldierToSquad(commissionedOfficer);
        squad1.addSoldierToSquad(nonCommissionedOfficer);
        logger.info("Squad1: " + squad1.getSquadArrayList());

        CommissionedOfficer commissionedOfficer2 = new CommissionedOfficer("Jonn", "Vujcic", "2000-01-20");
        CommissionedOfficer commissionedOfficer3 = new CommissionedOfficer("Jakub", "Jakubowski", "2000-01-22");
        Squad squad2 = new Squad();
        squad2.addSoldierToSquad(commissionedOfficer2);
        squad2.addSoldierToSquad(commissionedOfficer3);

        Platoon platoon1 = new Platoon();
        platoon1.addSquadToPlatoon(squad1);
        platoon1.addSquadToPlatoon(squad2);
        logger.info("Platoon: " + platoon1.getPlatoonArrayList());
        for (Squad squad: platoon1.getPlatoonArrayList()) {
            logger.info("Squad" + squad.getSquadArrayList());
        }

        LinkedList<Soldier> customLinkedList= new LinkedList<>();
        customLinkedList.add(commissionedOfficer);
        customLinkedList.add(commissionedOfficer2);
        customLinkedList.add(commissionedOfficer3);
        customLinkedList.print();

        ReadFileAndCalculateUniqueWords.processFile("exercise.txt", "exercise_result.txt");


        //Lambdas 08.05
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        LambdaFunctions predicate = new LambdaFunctions(numbers);
        predicate.removeEvenNumbersFromList();
        predicate.addRandomNumberToArray();
        predicate.printArray();
        predicate.printArrayWithIndexes();
        predicate.getArrayLength();
        predicate.isArrayLongerThan(3);


        //Streams 11.05
        Squad squad3 = new Squad();
        squad3.addSoldierToSquad(new Soldier("John", "Krasinski", "19/02/1995"));
        squad3.addSoldierToSquad(new Soldier("Gail", "Krasinski", "19/02/1990"));
        squad3.addSoldierToSquad(new Soldier("John", "Polak", "10/02/2000"));
        squad3.addSoldierToSquad(new Soldier("Wenek", "Sutek", "10/02/2010"));
        squad3.addSoldierToSquad(new Soldier("Jakub", "Jakubowski", "11/02/2000"));
        squad3.addSoldierToSquad(new Soldier("Pawel", "Sutek", "10/02/2010"));

        ArrayList<Soldier> soldierArrayList2 = squad3.getSquadArrayList();

        //Filter - non-terminal
        List<Soldier> filteredSoldiersListByName = soldierArrayList2.stream()
                .filter(soldier -> soldier.getName().contains("John")).collect(Collectors.toList());
        for (Soldier soldier : filteredSoldiersListByName) {
            System.out.println("Johns's " + soldier.getName());
        }

        //filter2 - non-terminal
        List<Soldier> pNameSoldiersList = soldierArrayList2.stream()
                .filter(soldier -> soldier.getName().startsWith("P"))
                .collect(Collectors.toList());
        for (Soldier soldier : pNameSoldiersList) {
            System.out.println("Names that start with P: " + soldier.getName());
        }

        //anyMatch - terminal
        System.out.println("Are there any Polak's?: " +
                soldierArrayList2.stream().anyMatch(soldier -> soldier.getSurname().contains("Polak")));

        //count - terminal
        System.out.println("Size: " + soldierArrayList2.stream().count());

        //map - non-terminal
        List<String> listMappedBySurname = soldierArrayList2.stream()
                .map(Soldier::getSurname)
                .collect(Collectors.toList());
        listMappedBySurname.forEach(s -> System.out.println(s));

        //joining - terminal
        String fullNamesString = soldierArrayList2.stream()
                .map(soldier -> soldier.getName() + " " + soldier.getSurname())
                .collect(Collectors.joining(", "));
        System.out.println("Long string: " + fullNamesString);

        //toMap - terminal. FullName (name + surname) as a key
        Map<String, Soldier> mapOfSoldiersByFullName = soldierArrayList2.stream()
                .collect(Collectors.toMap(soldier -> soldier.getName() + " " + soldier.getSurname(), soldier -> soldier));
        System.out.println("Map: " + mapOfSoldiersByFullName);*/

        //16.05
        //First connectionPool draft
        SimulateCollectionPoolUsage simulator = new SimulateCollectionPoolUsage();
        simulator.startSimulation();
    }
}