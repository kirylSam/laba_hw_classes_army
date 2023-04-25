package org.example.enums;

public enum VeteranRanks {
    UNDEFINED("UNDEFINED"),
    PRIVATE("Private"),
    SPECIALIST("Specialist"),
    CORPORAL("Corporal"),
    SERGEANT("Sergeant"),
    GENERAL("General"),
    BRIGADIER("Brigadier"),
    COLONEL("Colonel"),
    MAJOR("Major"),
    CAPTAIN("Captain"),
    WARRANT_OFFICER("WarrantOfficer");

    private final String prettyName;

    VeteranRanks(String prettyName) {
        this.prettyName = prettyName;
    }

    public String armyRegiment() {
        return prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
