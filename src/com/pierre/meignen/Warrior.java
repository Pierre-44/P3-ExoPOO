package com.pierre.meignen;

//TODO : Créer une classe Warrior qui va hériter de personnage et qui va modifier les points de vie et les points d’attaque de la classe mère
public class Warrior extends Character{

    public Warrior() {
        super("Aragorn","Guerrier courageux",80,new Sword("Epée",20));
    }
}
