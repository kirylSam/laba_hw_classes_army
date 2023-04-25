package org.example.enums;

public enum ArmyRegiments {
    UNDEFINED("UNDEFINED"),
    FIRST_INFANTRY_REGIMENT("1st Infantry Regiment"),
    FIFTH_INFANTRY_REGIMENT("5th Infantry Regiment"),
    SEVENTH_INFANTRY_REGIMENT("7th Infantry Regiment"),
    RANGER_REGIMENT("Ranger Regiment"),
    CAVALRY_REGIMENT("Cavalry Regiment"),
    LOUISIANA_NATIVE_GUARD("Louisiana Native Guard");

    private final String prettyName;

    ArmyRegiments(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getArmyRegiment() {
        return prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
