package model.hero;

import lombok.Getter;
import lombok.Setter;
import model.Unit;

@Getter
@Setter
public class Hero {

    private String heroName;
    private String heroRace;
    private String heroProfession;
    private boolean isLeader;
    private HeroExperience heroExperience;
    private double healthPoint;
    private double manaPoint;
    private double ragePoint;
    private HeroStat heroStat;

    public Hero(String heroName, boolean isLeader, Unit unit) {
        this.heroName = heroName;
        this.heroRace = unit.getRaceName();
        this.heroProfession = unit.getProfessionName();
        this.heroStat = new HeroStat(unit);
        this.isLeader = isLeader;
        this.healthPoint = StatUtil.calcMaxHealthPoint(this.heroStat);
        this.manaPoint = StatUtil.calcMaxManaPoint(this.heroStat);
        this.ragePoint = StatUtil.calcMaxRagePoint(this.heroStat);
    }
}
