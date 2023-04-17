package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's create a soldier!");
        Soldier soldier1 = new Soldier("Alex Johns", 25);
        System.out.println("We don't have any information about this soldier yet");
        System.out.println(soldier1.getAddress() + soldier1.getRank() + soldier1.getRegiment()
        + soldier1.getArmyInfo());

        soldier1.setAddress("Downing street", "Portland", "US");
        soldier1.setRank(Rank.Private);
        soldier1.setRegiment(Regiment.CavalryRegiment);
        soldier1.setArmyInfo(GeographicalCommand.USArmyAfrica, CommandHQ.ForSamHouston, ArmyComponent.RegularArmy);

        System.out.println("Now let's see his info after it's been added");
        System.out.println(soldier1.getAddress() + soldier1.getRank() + soldier1.getRegiment()
                + soldier1.getArmyInfo());

        System.out.println("Our soldier got older, became a general and was moved to other regiment");
        soldier1.setAge(40);
        System.out.println(soldier1.getNameSurname() + " " + soldier1.getAge());
        soldier1.setRank(Rank.General);
        soldier1.setRegiment(Regiment.FirstInfantryRegiment);
        soldier1.setArmyInfo(GeographicalCommand.USArmyEurope, CommandHQ.Weisbaden, ArmyComponent.RegularArmy);
        System.out.println(soldier1.getAddress() + soldier1.getRank() + soldier1.getRegiment()
                + soldier1.getArmyInfo());

        System.out.println("\n Let's create a veteran soldier, relived from duty");
        Veteran soldierVeteran = new Veteran("Old Man McGuckett", 65);
        soldierVeteran.setRank(Rank.Brigadier);
        System.out.println(soldierVeteran.getNameSurname() + " " + soldierVeteran.getAge() + ", "
                + soldierVeteran.getArmyInfo());

        System.out.println("\n The Army also has Civilians. Let's create one");
        CivilianEmployee civilian = new CivilianEmployee("Donald Bojden", 30);
        civilian.setGeneralScheduleGrade(GeneralScheduleGrade.GS8);
        civilian.setPosition("Biomechanical Engineer");
        civilian.setAddress("Main str", "Maine", "US");
        civilian.setSalary(65000);
        System.out.println(civilian.getNameSurname() + " " + civilian.getAge() + ", " + civilian.getPosition()
                + " " + civilian.getSalary() + " " + civilian.getGeneralScheduleGrade());
    }
    
}