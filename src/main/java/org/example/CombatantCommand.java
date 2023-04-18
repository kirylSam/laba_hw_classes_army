package org.example;

import org.example.enums.CombatantCommands;
import org.example.enums.CommandHQs;

public class CombatantCommand {
    private CombatantCommands combatantCommand;
    private CommandHQs commandHQ;

    public CombatantCommand() {
        this.combatantCommand = CombatantCommands.UNDEFINED;
        this.commandHQ = CommandHQs.UNDEFINED;
    }

    public String getCombatantCommand() {
        return "\n CombatantCommand: " + this.combatantCommand.toString();
    }

    public void setCombatantCommand(CombatantCommands combatantCommand) {
        this.combatantCommand = combatantCommand;
    }

    public String getCommandHQ() {
        return "\n CommandHQ: " + this.commandHQ.toString();
    }

    public void setCommandHQ(CommandHQs commandHQ) {
        this.commandHQ = commandHQ;
    }
}
