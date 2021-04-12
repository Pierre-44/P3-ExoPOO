package com.pierre.meignen;

//TODO : Créer une classe Weapon avec deux propriétés : Nom et points d’attaque. remplacer l'utilisation des point d'attaque par l'appel aux instances de cette classe

public abstract class Weapon {

    public String mWeaponName;
    public int mWeaponPoints;

    public Weapon(String mWeaponName, int mWeaponPoints) {
        this.mWeaponName = mWeaponName;
        this.mWeaponPoints = mWeaponPoints;
    }

    public Weapon() {
    }
}