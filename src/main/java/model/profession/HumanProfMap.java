package model.profession;

import model.MapKeys;
import model.Unit;
import model.profession.paladin.impl.HumanPaladin;
import model.profession.priest.impl.HumanPriest;

import java.util.HashMap;
import java.util.Map;

public class HumanProfMap {
    public Map<String, Unit> humanProfMap() {
        Map<String, Unit> humanProfMap = new HashMap<>();
        humanProfMap.put(MapKeys.ONE.getKey(), new HumanPaladin());
        humanProfMap.put(MapKeys.TWO.getKey(), new HumanPriest());
        return humanProfMap;
    }
}
