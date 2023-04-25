package org.example.enums;

public enum CommandHQs {
    UNDEFINED("UNDEFINED"),
    SHAW_AIR_FORCE_BASE("Shaw Air Force Base"),
    FORT_SAM_HOUSTON("Fort Sam Houston"),
    WEISBADEN("Weisbaden, Germany"),
    VINCENZA("Vincenza, Italy"),
    HAWAII("Hawaii");

    private final String prettyName;

    CommandHQs(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getCommandHQ() {
        return prettyName;
    }

    @Override
    public String toString() {
        return prettyName;
    }
}
