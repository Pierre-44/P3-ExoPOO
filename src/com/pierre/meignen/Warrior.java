package com.pierre.meignen;

//TODO : Créer une classe Warrior qui va hériter de personnage et qui va modifier les points de vie et les points d’attaque de la classe mère
public class Warrior extends Character{


    public Warrior(String mCharacterName, int pv, int pa) {
        super("Aragorne", 10, 20);
    }

    @Override
    public void present(){
        System.out.println();
    }
}
