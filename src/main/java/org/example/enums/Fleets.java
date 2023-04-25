package org.example.enums;

public enum Fleets {
    UNDEFINED("UNDEFINED"),
    US_PACIFIC_FLEET("US Pacific Forces"),
    US_FLEET_FORCES("US Fleet Forces"),
    US_NAVAL_FORCES("US Naval Forces"),
    US_FLEET_CYBER_COMMAND("US Fleet Cyber Command"),
    NAVAL_SPECIAL_WARFARE("Naval Special Warfare OPS"),
    NAVAL_RESERVE_FORCES("Naval Reserve Forces");

    private final String prettyName;

    Fleets(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getFleet() {
        return prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
