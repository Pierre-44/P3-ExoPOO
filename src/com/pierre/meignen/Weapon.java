package com.pierre.meignen;

//TODO : Créer une classe Weapon avec deux propriétés : Nom et points d’attaque. remplacer l'utilisation des point d'attaque par l'appel aux instances de cette classe

public class Weapon {

    public String mWeaponName;
    public int mWeaponPoints;

    public Weapon(String mWeaponName, int mWeaponPoints) {
        this.mWeaponName = mWeaponName;
        this.mWeaponPoints = mWeaponPoints;
    }

    public Weapon() {
    }

    /**
    * object declaration
    */

    public void stick() {
        Weapon weapon = new Weapon("baton de magicien", 20);
    }
    public void dagger() {
        Weapon weapon = new Weapon("dague", 10);
    }
    public void sword() {
        Weapon weapon = new Weapon("épée", 30);
    }
}
