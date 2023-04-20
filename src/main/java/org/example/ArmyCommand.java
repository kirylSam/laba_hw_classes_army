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
        return "\n Combatant Command: " + this.combatantCommands.toString() + " Command HQ: " + this.commandHQs.toString();
    }

    public void setArmyCommandInfo(CombatantCommands combatantCommands, CommandHQs commandHQs) {
        this.combatantCommands = combatantCommands;
        this.commandHQs = commandHQs;
    }

    public String getCombatantCommands() {
        return "\n Combatant Command " + this.combatantCommands.toString();
    }

    public void setCombatantCommands(CombatantCommands combatantCommands) {
        this.combatantCommands = combatantCommands;
    }

    public String getCommandHQs() {
        return "\n Command HQ: " + this.commandHQs.toString();
    }

    public void setCommandHQs(CommandHQs commandHQs) {
        this.commandHQs = commandHQs;
    }
}
