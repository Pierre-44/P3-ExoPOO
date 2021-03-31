package com.pierre.meignen;

//TODO : Créer une classe Magus qui va hériter de personnage et qui va modifier les points de vie et les points d’attaque de la classe mère
public class Magus extends Character{


    public Magus(String mCharacterName, int pv, int pa) {
        super("Gandalf",15,15);
    }

    @Override
    public void present(){
        System.out.println();
    }
}
