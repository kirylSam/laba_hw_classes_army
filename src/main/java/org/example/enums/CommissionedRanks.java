package org.example.enums;

public enum CommissionedRanks {
    UNDEFINED("UNDEFINED"),
    GENERAL("General"),
    BRIGADIER("Brigadier"),
    COLONEL("Colonel"),
    MAJOR("Major"),
    CAPTAIN("Captain");

    private String prettyName;

    CommissionedRanks(String prettyName) {
        this.prettyName = prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
