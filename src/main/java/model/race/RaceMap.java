package model.race;

import model.MapKeys;
import model.Unit;
import model.profession.DwarfProfMap;
import model.profession.ElfProfMap;
import model.profession.HumanProfMap;

import java.util.HashMap;
import java.util.Map;

public final class RaceMap {
    public static Map<String, Map<String, Unit>> raceMap() {
        Map<String, Map<String, Unit>> raceMap = new HashMap<>();
        raceMap.put(MapKeys.ONE.getKey(), new HumanProfMap().humanProfMap());
        raceMap.put(MapKeys.TWO.getKey(), new DwarfProfMap().dwarfProfMap());
        raceMap.put(MapKeys.THREE.getKey(), new ElfProfMap().elfProfMap());
        return raceMap;
    }
}
