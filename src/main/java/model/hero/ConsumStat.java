package model.hero;

import lombok.Getter;

@Getter
public class ConsumStat implements ConsumStatConst {

    private double healthPoint;
    private double manaPoint;
    private double ragePoint;

    ConsumStat() {
        this.healthPoint = START_HEALTH_POINT;
        this.manaPoint = START_MANA_POINT;
        this.ragePoint = START_RAGE_POINT;
    }

    public void calcMaxHealthPoint(HeroStat heroStat) {
        this.healthPoint = this.healthPoint + heroStat.getStamina() * HEALTH_COEF;
    }

    public void calcMaxManaPoint(HeroStat heroStat) {
        this.manaPoint = this.manaPoint + heroStat.getIntellect() * MANA_COEF;
    }

    public void calcMaxRagePoint(HeroStat heroStat) {
        this.ragePoint = this.ragePoint + heroStat.getAgility() * RAGE_COEF;
    }
}
