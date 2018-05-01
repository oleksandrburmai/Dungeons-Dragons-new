package util;

import model.Team;
import model.hero.Hero;

public class OutPutUtil {

    public static void printWelcomeMessage() {
        System.out.println("Hello! Welcome to Good Old Quest\n");
        System.out.println("Now you have to create a squadron of 3 heroes\n");
    }

    public static void printInfo() {
        printRaceInfo();
        printStatInfo();
    }

    private static void printRaceInfo() {
        System.out.println("Description of the race:\nRace - dwarf:\n" + "Stamina - 45. Agility - 20. Charisma - 5." +
                " Intellect - 15. Concentration - 5\nRace - human:\nStamina - 30. Agility - 15. Charisma - 10. " +
                "Intellect - 20. Concentration - 15\nRace - elf:\nStamina - 10. Agility - 22. Charisma - 15. " +
                "Intellect - 25. Concentration - 18\n");
    }

    private static void printStatInfo() {
        System.out.println("Description of the characteristics:\n" +
                "Stamina give - 2 hp per 1 stamina point, 0,25 hp regen per 1 stamina point.\n" +
                "Agility give – 4 rp per 1 agility point, chance to avoid hit 1% per 2 points.\n" +
                "Charisma give - 1 additional initiative point per 2 charisma points, charisma > " +
                "40 allows you to fear your enemies (0,75% chance per 2 points of charisma), " +
                "2% XP gain on every 2 points.\n" + "Intellect give – 2 mp per 1 intellect point, 0,25 mp regen per " +
                "1 intellect point.\n" + "Concentration give – 1 hp, 1,5 mp/1 rp regen per turn for 1 concentration " +
                "point, 1 turn cd discretion per 25 points.\n");
    }

    public static void printStatDistributeInfo(int statPoint) {
        System.out.println("You have " + statPoint + " characteristics that can be distributed\n" +
                "You can distribute this point to:\n1 - Stamina, 2 - Agility, 3 - Charisma, " +
                "4 - Intellect, 5 - Concentration. 6 - Stat info.");
    }

    public static void printTeamInfo(Team team, int i) {
        System.out.println("Info about hero " + team.getHeroes().get(i).getHeroName() + ":\nRace - " +
                team.getHeroes().get(i).getHeroRace() + ". Lvl - " +
                team.getHeroes().get(i).getHeroExperience().getHeroLevel() +
                ". Profession - " + team.getHeroes().get(i).getHeroProfession() + ".\nHealth - " +
                team.getHeroes().get(i).getConsumStat().getHealthPoint() + ". Mana - " +
                team.getHeroes().get(i).getConsumStat().getManaPoint() + ". Rage - " +
                team.getHeroes().get(i).getConsumStat().getRagePoint() + ".\nStamina - " +
                team.getHeroes().get(i).getHeroStat().getStamina() + ". Agility - " +
                team.getHeroes().get(i).getHeroStat().getAgility() + ". Charisma - " +
                team.getHeroes().get(i).getHeroStat().getCharisma() + ". Intellect - " +
                team.getHeroes().get(i).getHeroStat().getIntellect() + ". Concentration - " +
                team.getHeroes().get(i).getHeroStat().getConcentration() + ".");
    }

    public static void printHeroInfo(Hero hero) {
        System.out.println("Info about hero " + hero.getHeroName() + ":\nRace - " + hero.getHeroRace() + ". Lvl - " +
                hero.getHeroExperience().getHeroLevel() + ". Profession - " + hero.getHeroProfession() + ".\nHealth - "
                + hero.getConsumStat().getHealthPoint() + ". Mana - " + hero.getConsumStat().getManaPoint() +
                ". Rage - " + hero.getConsumStat().getRagePoint() + ".\nStamina - " + hero.getHeroStat().getStamina() +
                ". Agility - " + hero.getHeroStat().getAgility() + ". Charisma - " + hero.getHeroStat().getCharisma() +
                ". Intellect - " + hero.getHeroStat().getIntellect() + ". Concentration - " +
                hero.getHeroStat().getConcentration() + ".");
    }
}
