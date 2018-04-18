package model.race.elf;

import lombok.Getter;
import model.Unit;

@Getter
public class Elf implements ElfStartStat, Unit {

    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;

    protected Elf(String professionName) {
        this.raceName = RACE_NAME;
        this.professionName = professionName;
        this.charisma = CHARISMA;
        this.stamina = STAMINA;
        this.intellect = INTELLECT;
        this.agility = AGILITY;
        this.concentration = CONCENTRATION;
    }
}
