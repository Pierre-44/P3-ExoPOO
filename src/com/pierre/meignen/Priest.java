package com.pierre.meignen;

//TODO : Créer une nouvelle classe de type Priest qui hérite de la classe Character et qui va modifier le comportement la méthode actionOn pour ne plus attaquer, mais soigner avec les points d’attaque (par exemple, pour A.actionOn(B) : B.lifePoint ayant 10 à la fin de la fonction B aura 15 dans lifePoint si A a 5 points d’attaque et que A est un prêtre.
public class Priest extends Character {


    public Priest(String mCharacterName, int pv, int pa) {
        super("Frodon", 25, 5);
    }

    @Override
    public void present(){
        System.out.println();
    }
}
