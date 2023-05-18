package org.example.lambdas;

import org.example.Soldier;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFunctions {
    public static List<Soldier> sortByContainsName(List<Soldier> list, String name) {
        //Filter - non-terminal
        return list.stream()
                .filter(soldier -> soldier.getName().contains(name))
                .collect(Collectors.toList());
    }

    public static List<Soldier> filterByStartsWith(List<Soldier> list, String startsWith) {
        return list.stream()
                .filter(soldier -> soldier.getName().startsWith(startsWith))
                .collect(Collectors.toList());
    }

    public static boolean isThereAnySoldierWithMatchingSurname(List<Soldier> list, String surnameToMatch) {
        return list.stream()
                .anyMatch(soldier -> soldier.getSurname().contains(surnameToMatch));
    }

    public static int countSoldiersInList(List<Soldier> list) {
        return (int) list.stream().count();
    }

    public static List<String> mapSoldiersBySurnameReturnStrings(List<Soldier> list) {
        return list.stream()
                .map(Soldier::getSurname)
                .collect(Collectors.toList());
    }

    public static String joinIntoOneString(List<Soldier> list) {
        return list.stream()
                .map(soldier -> soldier.getName() + " " + soldier.getSurname())
                .collect(Collectors.joining(", "));
    }

    public static Map<String, Soldier> convertToMap(List<Soldier> list) {
        return list.stream()
                .collect(Collectors.toMap(soldier -> soldier.getName() + " " + soldier.getSurname(), soldier -> soldier));
    }
}
