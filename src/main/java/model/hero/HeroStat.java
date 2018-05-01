package model.hero;

import lombok.Getter;
import model.Unit;
import model.hero.experience.ExperienceConst;

@Getter
public class HeroStat {

    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;
    private int initiative;
    private int avoidChance;

    HeroStat(Unit unit) {
        this.charisma = unit.getCharisma();
        this.stamina = unit.getStamina();
        this.intellect = unit.getIntellect();
        this.agility = unit.getAgility();
        this.concentration = unit.getConcentration();
        this.initiative = unit.getCharisma() / ExperienceConst.COEFFICIENT;
        this.avoidChance = unit.getAgility() / ExperienceConst.COEFFICIENT;
    }

    public void setInitiative(HeroStat heroStat) {
        this.initiative = heroStat.charisma / ExperienceConst.COEFFICIENT;
    }

    public void setAvoidChance(HeroStat heroStat) {
        this.initiative = heroStat.agility / ExperienceConst.COEFFICIENT;
    }

    public Void setCharisma(int charisma) {
        this.charisma = this.charisma + charisma;
        return null;
    }

    public Void setStamina(int stamina) {
        this.stamina = this.stamina + stamina;
        return null;
    }

    public Void setIntellect(int intellect) {
        this.intellect = this.intellect + intellect;
        return null;
    }

    public Void setAgility(int agility) {
        this.agility = this.agility + agility;
        return null;
    }

    public Void setConcentration(int concentration) {
        this.concentration = this.concentration + concentration;
        return null;
    }
}
