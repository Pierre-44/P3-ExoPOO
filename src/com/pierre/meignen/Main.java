package com.pierre.meignen;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

// TODO : Créer une classe Character avec deux propriétés : points de vie et points d’attaque.
// TODO : Ajouter une méthode present() afin d’afficher les caractéristiques d’un personnage

// TODO : Créer une classe Warrior qui va hériter de personnage et qui va modifier les points de vie et les points d’attaque de la classe mère

// TODO : Créer une classe Magus qui va hériter de personnage et qui va modifier les points de vie et les points d’attaque de la classe mère

// TODO : Enrichir la méthode present() de la classe Character, dans les classes filles Magus et Warrior pour indiquer le type du personnage

// TODO : Créer une nouvelle méthode sur la classe Character,
//  qui prend en paramètre un autre Character,
//  et qui va retourner le personnage le plus fort des deux
//  (par exemple, le personnage qui a le plus de points d’attaque,
//  si identique, le personnage qui a le plus de points de vie,
//  si identique, le premier personnage)

// TODO : Créer une nouvelle méthode sur la classe Character, appelée actionOn,
//  qui prend en paramètre un autre Character et qui va aller déduire des points de vie de ce personnage,
//  les points d’attaque du personnage qui appelle la méthode.
//  (par exemple, pour A.actionOn(B) : B.lifePoint ayant 10 à la fin de la fonction B aura plus que 5 dans lifePoint si A a 5 points d’attaque)

// TODO : Créer une nouvelle classe de type Priest qui hérite de la classe Character et qui va modifier le comportement la méthode actionOn
// pour ne plus attaquer, mais soigner avec les points d’attaque
// (par exemple, pour A.actionOn(B) : B.lifePoint ayant 10 à la fin de la fonction B aura 15 dans lifePoint si A a 5 points d’attaque et que A est un prêtre.