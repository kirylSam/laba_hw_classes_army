package org.example;

import org.example.enums.ArmyComponents;
import org.example.enums.ArmyRegiments;
import org.example.enums.CombatantCommands;
import org.example.enums.CommandHQs;

public class Soldier extends Person{
    private CombatantCommand combatantCommand;
    private ArmyComponents armyComponent;
    private ArmyRegiments armyRegiment;

    public Soldier(String name, String surname, String DOB) {
        super(name, surname, DOB);
        combatantCommand = new CombatantCommand();
        this.armyComponent = ArmyComponents.UNDEFINED;
        this.armyRegiment = ArmyRegiments.UNDEFINED;
    }
    public String getCombatantCommand() {
        return this.combatantCommand.getCombatantCommand() + this.combatantCommand.getCommandHQ();
    }
    public void setCombatantCommand(CombatantCommands combatantCommand, CommandHQs commandHQ) {
        this.combatantCommand.setCombatantCommand(combatantCommand);
        this.combatantCommand.setCommandHQ(commandHQ);
    }
    public String getArmyComponent() {
        return "\n ArmyComponent: " + this.armyComponent.toString();
    }
    public void setArmyComponent(ArmyComponents armyComponents) {
        this.armyComponent = armyComponents;
    }
    public String getRegiment() {
        return "\n Regiment: " + this.armyRegiment.toString();
    }
    public void setRegiment(ArmyRegiments armyRegiments) {
        this.armyRegiment = armyRegiments;
    }
}
