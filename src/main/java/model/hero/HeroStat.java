package model.hero;

import lombok.Getter;
import model.Unit;

@Getter
public class HeroStat {

    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;

    HeroStat(Unit unit) {
        this.charisma = unit.getCharisma();
        this.stamina = unit.getStamina();
        this.intellect = unit.getIntellect();
        this.agility = unit.getAgility();
        this.concentration = unit.getConcentration();
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
