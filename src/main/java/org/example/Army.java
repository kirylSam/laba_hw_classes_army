package org.example;

public abstract class Army extends Person{
    private ArmyCommand armyCommand;
    private ArmyComponent armyComponent;

    public Army(String nameSurname, int age) {
        super(nameSurname, age);
        this.armyCommand = new ArmyCommand();
        this.armyComponent = ArmyComponent.UNDEFINED;
    }


    public String getArmyInfo(){
        return "\n Army Command: " + this.armyCommand.getArmyCommandInfo() + " Army Component: " + this.armyComponent.toString();
    }

    public void setArmyInfo(GeographicalCommand geographicalCommand, CommandHQ commandHQ, ArmyComponent armyComponent) {
        this.armyCommand.setArmyCommandInfo(geographicalCommand, commandHQ);
        this.armyComponent = armyComponent;
    }
}
