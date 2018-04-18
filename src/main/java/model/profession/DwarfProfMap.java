package model.profession;

import model.MapKeys;
import model.Unit;
import model.profession.mechanist.impl.DwarfMechanist;
import model.profession.warrior.impl.DwarfWarrior;

import java.util.HashMap;
import java.util.Map;

public class DwarfProfMap {
    public Map<String, Unit> dwarfProfMap() {
        Map<String, Unit> dwarfProfMap = new HashMap<>();
        dwarfProfMap.put(MapKeys.ONE.getKey(), new DwarfMechanist());
        dwarfProfMap.put(MapKeys.TWO.getKey(), new DwarfWarrior());
        return dwarfProfMap;
    }
}
