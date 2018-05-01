package model;

import lombok.Getter;
import lombok.Setter;
import model.hero.Hero;
import model.hero.StatUtil;
import model.hero.experience.ExperienceConst;
import model.race.RaceMap;
import util.InPutUtil;
import util.OutPutUtil;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private static final int TEAM_MEMBERS = 3;

    @Getter
    @Setter
    private List<Hero> heroes;

    public void creatTeam() {
        this.heroes = new ArrayList<>(TEAM_MEMBERS);
        heroes.add(createLeaderHero());
        StatUtil.addHeroStat(heroes.get(0));
        for (int i = 1; i < TEAM_MEMBERS; i++) {
            System.out.println("Create " + i + " comrade hero");
            heroes.add(createComradeHero());
            StatUtil.addHeroStat(heroes.get(i));

        }

    }

    private Hero createLeaderHero() {
        System.out.println("Create leader hero");
        String heroName = InPutUtil.getHeroName();
        String heroRace = InPutUtil.getHeroRace();
        return new Hero(heroName, true,
                RaceMap.raceMap().get(heroRace).get(InPutUtil.getHeroProf(heroRace)));
    }

    private Hero createComradeHero() {
        String heroName = InPutUtil.getHeroName();
        String heroRace = InPutUtil.getHeroRace();
        return new Hero(heroName, false,
                RaceMap.raceMap().get(heroRace).get(InPutUtil.getHeroProf(heroRace)));
    }

    public void distrybXp(double xp) {
        for (Hero hero : heroes) {
            if (hero.isLeader()) {
                hero.getHeroExperience().setHeroXp(xp * ExperienceConst.LEADER_XP_COEF +
                        (xp * ExperienceConst.LEADER_XP_COEF * hero.getHeroExperience().getOverXpGive()));
                heroLvlUp(hero);
            } else {
                hero.getHeroExperience().setHeroXp(xp * ExperienceConst.COMRADE_XP_COEF +
                        (xp * ExperienceConst.COMRADE_XP_COEF * hero.getHeroExperience().getOverXpGive()));
                heroLvlUp(hero);
            }
        }
    }

    private void heroLvlUp(Hero hero) {
        if (hero.getHeroExperience().getHeroXp() >= hero.getHeroExperience().getNeedXpToNextLvl() &&
                hero.getHeroExperience().getHeroLevel() <= ExperienceConst.MAX_LVL) {
            System.out.println("\nCongratulation  " + hero.getHeroName() + " is lvl up:\n");
            int sumHeroLvl = 0;
            for (int i = 0; i < TEAM_MEMBERS; i++) {
                sumHeroLvl = heroes.get(i).getHeroExperience().getHeroLevel();
            }
            hero.getHeroExperience().setNeedXpToNextLvl(sumHeroLvl);
            hero.getHeroExperience().setHeroLvl(1);
            StatUtil.addHeroStat(hero);
            OutPutUtil.printHeroInfo(hero);
        }
    }
}
