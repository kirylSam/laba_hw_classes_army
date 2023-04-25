package org.example.enums;

public enum NonCommissionedRanks {
    UNDEFINED("UNDEFINED"),
    PRIVATE("Private"),
    SPECIALIST("Specialist"),
    CORPORAL("Corporal"),
    SERGEANT("Sergeant"),
    WARRANT_OFFICER("WarrantOfficer");

    private final String prettyName;

    NonCommissionedRanks(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getNonCommissionedRank() {
        return prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
