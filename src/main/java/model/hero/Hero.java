package model.hero;

import lombok.Getter;
import lombok.Setter;
import model.Unit;
import model.hero.experience.HeroExperience;
import model.hero.regen.HeroRegen;

@Getter
@Setter
public class Hero {

    private String heroName;
    private String heroRace;
    private String heroProfession;
    private boolean isLeader;
    HeroExperience heroExperience;
    ConsumStat consumStat;
    HeroStat heroStat;
    HeroRegen heroRegen;

    public Hero(String heroName, boolean isLeader, Unit unit) {
        this.heroName = heroName;
        this.heroRace = unit.getRaceName();
        this.heroProfession = unit.getProfessionName();
        this.heroStat = new HeroStat(unit);
        this.heroExperience = new HeroExperience(this.heroStat);
        this.heroRegen = new HeroRegen();
        this.consumStat = new ConsumStat();
        this.isLeader = isLeader;
    }
}
