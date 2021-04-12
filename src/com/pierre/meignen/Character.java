package com.pierre.meignen;


//TODO : Créer une classe Character avec deux propriétés : points de vie et points d’attaque. Ajouter une méthode present() afin d’afficher les caractéristiques d’un personnage

/**
 * character with attack point and life point and name parameters
 */
public abstract class Character {

    protected String mCharacterName;
    protected String mCharacterType;
    protected int pv;
    protected Weapon mWeapon;

    // Constructor
    public Character(String CharacterName, String CharacterType, int pv, Weapon weapon) {
        this.mCharacterName = CharacterName;
        this.mCharacterType = CharacterType;
        this.pv = pv;
        this.mWeapon = weapon;
    }

    //TODO : Enrichir la méthode present() de la classe Character, dans les classes filles Magus et Warrior pour indiquer le type du personnage
    /**
     * Diplay Character and properties
     * Character Name
     * Character Type
     * Nomber of pv
     * Nomber of pa
     */
    public void present() {

        System.out.println("Nom du personage :" + mCharacterName);
        System.out.println("type du personage :" + mCharacterType);
        System.out.println(pv + " point de vie");
        System.out.println(" ");
    }

    //TODO : Créer une nouvelle méthode sur la classe Character, qui prend en paramètre un autre Character, et qui va retourner le personnage le plus fort des deux (par exemple, le personnage qui a le plus de points d’attaque, si identique, le personnage qui a le plus de points de vie, si identique, le premier personnage)

    /**
     * Character compare of pv and pa
     * @param character
     * @return best character
     */
    private Character characterCompare(Character character) {
        int comparePoints = this.pv - character.pv;
        if (comparePoints < 0) {
            return character;
        } else if (comparePoints > 0) {
            return this;
        } else {
            return null;
        }
    }
    /**
     * Compare 2 characters in fight , in first on pv, if equal on pa and if equal the first to attack win
     * @param character vs other character
     * @return best character or if equal the first to attack
     */
    protected Character winnerOfTheFight (Character character) {
        System.out.println(mCharacterName + " se mesure à " + character.mCharacterName + " :");
        Character best = characterCompare(character);
        // winner condition :
        if (best == null) ;
        {
            best = characterCompare(character);
            if (best == null || best == this) {
                showTheWinner(this.mCharacterName);
                {
                    return this;
                }
            }
        }

        showTheWinner(best.mCharacterName);
        return best;
    }

    /**
    * Show the winner
    */
    private void showTheWinner(String theWinner) {
        System.out.println("le vainqueur est "+ theWinner + " bravo à lui !");
    }

    //TODO : Créer une nouvelle méthode sur la classe Character, appelée actionOn, qui prend en paramètre un autre Character et qui va aller déduire des points de vie de ce personnage, les points d’attaque du personnage qui appelle la méthode. (par exemple, pour A.actionOn(B) : B.lifePoint ayant 10 à la fin de la fonction B aura plus que 5 dans lifePoint si A a 5 points d’attaque)

    /**
     * Methode to perform action of Character to reduce pa on pv of an other Character give in parameter
     * @param character (character to be attacked)
     */

    public void actionOn(Character character){
        System.out.println(this.mCharacterName + " attaque " + character.mCharacterName + " qui a " + character.pv + " point(s) de vie avec comme arme " + mWeapon.mWeaponName + " arme avec " + mWeapon.mWeaponPoints + " points d'attaque.");
        character.pv -= this.mWeapon.mWeaponPoints;
        System.out.println("il reste " + character.pv + " points de vie à " + character.mCharacterName);
    }

}