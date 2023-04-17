package org.example;

public class ArmyCommand {
    private GeographicalCommand geographicalCommand;
    private CommandHQ commandHQ;

    public ArmyCommand() {
        this.geographicalCommand = GeographicalCommand.UNDEFINED;
        this.commandHQ = CommandHQ.UNDEFINED;
    }

    public String getArmyCommandInfo() {
        return "\n GeoCommand: " + this.geographicalCommand.toString() + " CommandHQ: " + this.commandHQ.toString();
    }

    public void setArmyCommandInfo(GeographicalCommand geographicalCommand, CommandHQ commandHQ) {
        this.geographicalCommand = geographicalCommand;
        this.commandHQ = commandHQ;
    }
}
