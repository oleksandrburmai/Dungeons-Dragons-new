package model.hero.regen;

import lombok.Getter;

@Getter
public class HeroRegen implements RegenConst {

    private double healthRegen;
    private double manaRegen;
    private double rageRegen;


    public void setHealthRegen(int stamina, int concentration) {
        this.healthRegen = stamina * REGEN_PER_POINT + concentration;
    }

    public void setManaRegen(int intellect, int concentration) {
        this.manaRegen = intellect * REGEN_PER_POINT + concentration * MANA_REGEN;
    }

    public void setRageRegen(int concentration) {
        this.rageRegen = concentration;
    }
}
