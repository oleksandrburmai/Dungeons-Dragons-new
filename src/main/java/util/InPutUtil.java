package util;

import model.MapKeys;
import model.hero.Hero;
import model.hero.StatUtil;
import model.race.RaceMap;

import java.util.stream.Stream;


public class InPutUtil {

    public static String getHeroName() {
        System.out.println("Enter hero name");
        return ScannerUtil.getString();
    }

    public static String getHeroRace(){
        System.out.println("Choice one of this race\n1 - Human, 2 - Dwarf, 3 - Elf.");
        while (true){
            String heroRace= ScannerUtil.getString();
            if (RaceMap.raceMap().containsKey(heroRace)) {
                return heroRace;
            }
            System.out.println("Race chosen incorrectly. Try again");
        }
    }

    public static String getHeroProf(String heroRace){
        System.out.println("Choice one of this profession\n1 - " +
                RaceMap.raceMap().get(heroRace).get(MapKeys.ONE.getKey()).getProfessionName() + ", 2 - " +
                RaceMap.raceMap().get(heroRace).get(MapKeys.TWO.getKey()).getProfessionName() + ".");
        while (true) {
            String profession = ScannerUtil.getString();
            if (RaceMap.raceMap().get(heroRace).containsKey(profession)) {
                return profession;
            }
            System.out.println("Choice wrong profession. Try again");
        }
    }

    public static String getStat() {
        System.out.println("Enter characteristic which you want to increase:");
        while (true) {
            String selectedStat = ScannerUtil.getString();
            if (StatUtil.statMapKeyList().contains(selectedStat)) {
                return selectedStat;
            }
            System.out.println("You choice wrong characteristic. Try again.");
        }
    }

    public static int numberOfPoint(int statPoint) {
        System.out.println("Enter number of points for distribution:");
        while (true) {
            int distributedPoint = ScannerUtil.getInt();
            if (statPoint >= distributedPoint && distributedPoint > 0) {
                return distributedPoint;
            }
            System.out.println("You input wrong number of point to distribute. Try again.");
        }
    }
}
