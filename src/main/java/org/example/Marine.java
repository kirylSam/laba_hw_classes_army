package org.example;

import org.example.enums.Fleets;
import org.example.enums.CombatantCommands;
import org.example.enums.CommandHQs;

public class Marine extends Person{
    private CombatantCommand combatantCommand;
    private Fleets fleet;

    public Marine(String name, String surname, String DOB) {
        super(name, surname, DOB);
        combatantCommand = new CombatantCommand();
        this.fleet = Fleets.UNDEFINED;
    }

    public String getCombatantCommand() {
        return this.combatantCommand.getCombatantCommand() + this.combatantCommand.getCommandHQ();
    }

    public void setCombatantCommand(CombatantCommands combatantCommand, CommandHQs commandHQ) {
        this.combatantCommand.setCombatantCommand(combatantCommand);
        this.combatantCommand.setCommandHQ(commandHQ);
    }

    public String getFleet() {
        return "\n Fleet: " + this.fleet.toString();
    }

    public void setFleet(Fleets fleet) {
        this.fleet = fleet;
    }
}
