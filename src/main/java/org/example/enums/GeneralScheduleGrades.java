package org.example.enums;

public enum GeneralScheduleGrades {
    UNDEFINED("UNDEFINED"),
    GS3("GS3"),
    GS4("GS4"),
    GS5("GS5"),
    GS6("GS6"),
    GS11("GS11"),
    GS12("GS12"),
    GS13("GS13"),
    GS14("GS14"),
    GS15("GS15");

    private String prettyName;

    GeneralScheduleGrades(String prettyName) {
        this.prettyName = prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
