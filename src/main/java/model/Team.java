package model;

import lombok.Getter;
import lombok.Setter;
import model.hero.Hero;
import model.hero.StatUtil;
import model.race.RaceMap;
import util.InPutUtil;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private static final int TEAM_MEMBERS = 3;

    @Getter
    @Setter
    private List<Hero> heroes;

    public void creatTeam(){
        this.heroes = new ArrayList<>(TEAM_MEMBERS);
        heroes.add(createLeaderHero());
        StatUtil.addHeroStat(heroes.get(0));
        for (int i = 1; i< TEAM_MEMBERS; i++){
            System.out.println("Create " + i + " comrade hero");
            heroes.add(createComradeHero());
            StatUtil.addHeroStat(heroes.get(i));
        }

    }

    private Hero createLeaderHero(){
        System.out.println("Create leader hero");
        String heroName = InPutUtil.getHeroName();
        String heroRace = InPutUtil.getHeroRace();
        return new Hero(heroName, true,
                RaceMap.raceMap().get(heroRace).get(InPutUtil.getHeroProf(heroRace)));
    }

    private Hero createComradeHero(){
        System.out.println("Create leader hero");
        String heroName = InPutUtil.getHeroName();
        String heroRace = InPutUtil.getHeroRace();
        return new Hero(heroName, false,
                RaceMap.raceMap().get(heroRace).get(InPutUtil.getHeroProf(heroRace)));
    }
}
