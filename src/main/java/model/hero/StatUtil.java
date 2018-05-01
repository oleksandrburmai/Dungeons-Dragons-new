package model.hero;

import model.MapKeys;
import util.InPutUtil;
import util.OutPutUtil;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class StatUtil {

    private static final int START_STAT_POINT = 10;

    private StatUtil() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of StatUtil");
    }

    private static void reCalcStat(Hero hero) {
        hero.heroRegen.setHealthRegen(hero.heroStat.getStamina(), hero.heroStat.getConcentration());
        hero.heroRegen.setManaRegen(hero.heroStat.getIntellect(), hero.heroStat.getConcentration());
        hero.heroRegen.setRageRegen(hero.heroStat.getConcentration());
        hero.consumStat.calcMaxHealthPoint(hero.heroStat);
        hero.consumStat.calcMaxManaPoint(hero.heroStat);
        hero.consumStat.calcMaxRagePoint(hero.heroStat);
        hero.heroExperience.setOverXpGive(hero.heroStat);
        hero.heroStat.setInitiative(hero.heroStat);
        hero.heroStat.setAvoidChance(hero.heroStat);
    }

    public static void addHeroStat(Hero hero) {
        int statPoint = START_STAT_POINT;
        OutPutUtil.printStatDistributeInfo(statPoint);
        while (statPoint > 0) {
            String selectedStat = InPutUtil.getStat();
            int distributedPoint = InPutUtil.numberOfPoint(statPoint);
            statMap(hero, distributedPoint).get(selectedStat);
            statPoint -= distributedPoint;
            if (statPoint > 0) {
                System.out.println("You have " + statPoint + " characteristics that can be distributed");
            }
        }
        reCalcStat(hero);
    }

    private static Map<String, Void> statMap(Hero hero, int point) {
        Map<String, Void> statMap = new HashMap<>();
        statMap.put(MapKeys.ONE.getKey(), hero.getHeroStat().setStamina(point));
        statMap.put(MapKeys.TWO.getKey(), hero.getHeroStat().setAgility(point));
        statMap.put(MapKeys.THREE.getKey(), hero.getHeroStat().setCharisma(point));
        statMap.put(MapKeys.FOUR.getKey(), hero.getHeroStat().setIntellect(point));
        statMap.put(MapKeys.FIVE.getKey(), hero.getHeroStat().setConcentration(point));
        return statMap;
    }

    public static List<String> statMapKeyList() {
        List<String> statMapKeyList = new LinkedList<>();
        statMapKeyList.add(MapKeys.ONE.getKey());
        statMapKeyList.add(MapKeys.TWO.getKey());
        statMapKeyList.add(MapKeys.THREE.getKey());
        statMapKeyList.add(MapKeys.FOUR.getKey());
        statMapKeyList.add(MapKeys.FIVE.getKey());
        return statMapKeyList;
    }
}
