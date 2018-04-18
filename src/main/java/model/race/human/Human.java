package model.race.human;

import lombok.Getter;
import model.Unit;

@Getter
public class Human implements HumanStartStat, Unit {

    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;

    protected Human(String professionName) {
        this.raceName = RACE_NAME;
        this.professionName = professionName;
        this.charisma = CHARISMA;
        this.stamina = STAMINA;
        this.intellect = INTELLECT;
        this.agility = AGILITY;
        this.concentration = CONCENTRATION;

    }
}
