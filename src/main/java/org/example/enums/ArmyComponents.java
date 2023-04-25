package org.example.enums;

public enum ArmyComponents {
    UNDEFINED("UNDEFINED"),
    REGULAR_ARMY("Regular Army"),
    ARMY_NATIONAL_GUARD("National Guard"),
    ARMY_RESERVE("National Reserve");

    private final String prettyName;

    ArmyComponents(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getArmyComponent() {
        return prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
