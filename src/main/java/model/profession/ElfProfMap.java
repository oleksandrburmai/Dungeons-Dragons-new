package model.profession;

import model.MapKeys;
import model.Unit;
import model.profession.gunslinger.impl.ElfGunslinger;
import model.profession.mage.impl.ElfMage;

import java.util.HashMap;
import java.util.Map;

public class ElfProfMap {
    public  Map<String, Unit> elfProfMap() {
        Map<String, Unit> elfProfMap = new HashMap<>();
        elfProfMap.put(MapKeys.ONE.getKey(), new ElfGunslinger());
        elfProfMap.put(MapKeys.TWO.getKey(), new ElfMage());
        return elfProfMap;
    }
}
