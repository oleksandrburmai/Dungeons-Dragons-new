package model.profession.priest.impl;


import model.race.human.Human;
import model.profession.priest.Priest;

public class HumanPriest extends Human implements Priest {

    public HumanPriest() {
        super(PROFESSION_NAME);
    }
}
