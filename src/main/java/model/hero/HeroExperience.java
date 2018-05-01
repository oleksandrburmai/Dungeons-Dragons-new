package model.hero;

import lombok.Getter;

@Getter
public class HeroExperience implements ExperienceConst {
    private int heroLevel;
    private double heroXp;
    private double needXpToNextLvl;

    HeroExperience() {
        heroLevel = START_LVL;
        heroXp = START_XP;
        needXpToNextLvl = CONST_NEED_XP;
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
