package com.pierre.meignen;



//TODO : Créer une classe Character avec deux propriétés : points de vie et points d’attaque. Ajouter une méthode present() afin d’afficher les caractéristiques d’un personnage

/**
 * character with attack point and life point and name parameters
 */
public abstract class Character {

    protected String mCharacterName;
    protected String mCharacterType;
    protected int pv;
    protected int pa;


    // Constructor
    public Character(String mCharacterName, int pv, int pa) {
        this.mCharacterName = mCharacterName;
        this.mCharacterType = mCharacterType;
        this.pv = pv;
        this.pa = pa;
    }

    // setter CharacterName
    public void setCharacterName (String mCharacterName) {
        this.mCharacterName = mCharacterName;
    }

    // setter CharacterType
    public void setCharacterType (String mCharacterType) {
        this.mCharacterType = mCharacterType;
    }

    // setter pv
    public int setPv() {
        return pv;
    }

    // setter pa
    public int setPa() {
        return pa;
    }

    //TODO : Enrichir la méthode present() de la classe Character, dans les classes filles Magus et Warrior pour indiquer le type du personnage

    @Override
    public void present() {
        System.out.println("caractéristique personnage : ");
        System.out.println("Nom du personage :" + mCharacterName);
        System.out.println("Type de personage :" + mCharacterType);
        System.out.println(pv + "point(s) de vie");
        System.out.println(pa + "point(s) de d'attaque");
    }

    //TODO : Créer une nouvelle méthode sur la classe Character, qui prend en paramètre un autre Character, et qui va retourner le personnage le plus fort des deux (par exemple, le personnage qui a le plus de points d’attaque, si identique, le personnage qui a le plus de points de vie, si identique, le premier personnage)

    /**
     * Comparative methode which takes another character as a parameter, and which will return the stronger character of the two
     */
    public void compareCharacter() {

        System.out.println();
    }

    //TODO : Créer une nouvelle méthode sur la classe Character, appelée actionOn, qui prend en paramètre un autre Character et qui va aller déduire des points de vie de ce personnage, les points d’attaque du personnage qui appelle la méthode. (par exemple, pour A.actionOn(B) : B.lifePoint ayant 10 à la fin de la fonction B aura plus que 5 dans lifePoint si A a 5 points d’attaque)


    /**
     * Methode to perform action of Character to reduce pa on de pv of an other Caracter
     */

    public void actionOn(){

        System.out.println();

    }
}