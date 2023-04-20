package org.example.enums;

public enum NavyRanks {
    UNDEFINED("UNDEFINED"),
    SEAMAN("Seaman"),
    PETTY_OFFICER("Petty Officer"),
    CHIEF_PETTY_OFFICER("Chief Petty Officer"),
    SENIOR_CHIEF_PETTY_OFFICER("Senior Chief Petty Officer"),
    ENSIGN ("Ensign"),
    COMMANDER ("Commander"),
    CAPTAIN("Captain"),
    ADMIRAL("Admiral"),
    FLEET_ADMIRAL("Fleet Admiral");

    private String prettyName;

    NavyRanks(String prettyName) {
        this.prettyName = prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
