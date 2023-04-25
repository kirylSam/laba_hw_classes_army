package org.example.enums;

public enum CombatantCommands {
    UNDEFINED("UNDEFINED"),
    US_ARMY_CENTRAL("US Army Central"),
    US_ARMY_NORTH("US Army North"),
    US_ARMY_SOUTH("US Army South"),
    US_ARMY_EUROPE("US Army Europe"),
    US_ARMY_AFRICA("US Army Africa"),
    US_ARMY_CYBERCOMMAND("US Army Cyber Command");

    private final String prettyName;

    CombatantCommands(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getCombatantCommand() {
        return prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
