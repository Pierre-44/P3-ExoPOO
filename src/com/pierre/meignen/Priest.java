package com.pierre.meignen;

//TODO : Créer une nouvelle classe de type Priest qui hérite de la classe Character et qui va modifier le comportement la méthode actionOn pour ne plus attaquer, mais soigner avec les points d’attaque (par exemple, pour A.actionOn(B) : B.lifePoint ayant 10 à la fin de la fonction B aura 15 dans lifePoint si A a 5 points d’attaque et que A est un prêtre.
public class Priest extends Character {

    private static final Object Dagger = new Dagger("dague",20);

    public Priest() {
        super("Frodon","Hobit courageux",90);
    }

    @Override
    public void actionOn(Character character,Weapon weapon) {
        System.out.println(this.mCharacterName + " soigne le " + character.mCharacterName + " qui a " + character.pv + " point(s) de vie :");
        character.pv += this.mWeapon.mWeaponPoints;
        System.out.println(character.mCharacterName + " a maintenant " + character.pv + " points de vie !" );
    }
}
