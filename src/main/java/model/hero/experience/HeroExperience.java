package model.hero.experience;

import lombok.Getter;
import model.hero.HeroStat;

@Getter
public class HeroExperience implements ExperienceConst {
    private int heroLevel;
    private double heroXp;
    private double needXpToNextLvl;
    private int overXpGive;

    public HeroExperience(HeroStat heroStat) {
        this.heroLevel = START_LVL;
        this.heroXp = START_XP;
        this.needXpToNextLvl = CONST_NEED_XP;
        this.overXpGive = heroStat.getCharisma() / COEFFICIENT;
    }

    public void setOverXpGive(HeroStat heroStat) {
        this.overXpGive = heroStat.getCharisma() / COEFFICIENT;
    }

    public void setNeedXpToNextLvl(int sumHeroLvl) {
        this.needXpToNextLvl = this.needXpToNextLvl * ((CONST_NEED_XP - (sumHeroLvl))
                / CONST_NEED_XP) + this.needXpToNextLvl;
    }

    public void setHeroLvl(int lvl) {
        this.heroLevel = this.heroLevel + lvl;
    }

    public void setHeroXp(double xp) {
        this.heroXp = this.heroXp + xp;
    }
}
