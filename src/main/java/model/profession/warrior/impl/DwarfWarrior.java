package model.profession.warrior.impl;


import model.profession.warrior.Warrior;
import model.race.dwarf.Dwarf;

public class DwarfWarrior extends Dwarf implements Warrior{

    public DwarfWarrior() {
        super(PROFESSION_NAME);
    }
}
