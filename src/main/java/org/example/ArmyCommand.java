package org.example;

import org.example.enums.CombatantCommands;
import org.example.enums.CommandHQs;

public class ArmyCommand {
    private CombatantCommands combatantCommands;
    private CommandHQs commandHQs;

    public ArmyCommand() {
        this.combatantCommands = CombatantCommands.UNDEFINED;
        this.commandHQs = CommandHQs.UNDEFINED;
    }

    public String getArmyCommandInfo() {
        return "\n GeoCommand: " + this.combatantCommands.toString() + " CommandHQ: " + this.commandHQs.toString();
    }

    public void setArmyCommandInfo(CombatantCommands combatantCommands, CommandHQs commandHQs) {
        this.combatantCommands = combatantCommands;
        this.commandHQs = commandHQs;
    }
}
