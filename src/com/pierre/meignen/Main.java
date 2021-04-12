package com.pierre.meignen;

public class Main {

        public static void main(String[] args) {
                System.out.println("Présentation des protagonistes :");
                System.out.println("");

                // Prentation guerrier
                Warrior guerrier1 = new Warrior();
                guerrier1.present();

                // Prentation mage
                Magus mage1 = new Magus();
                mage1.present();
                // Prentation pretre
                Priest pretre1 = new Priest();
                pretre1.present();


                Sword sword1 = new Sword("épée", 30);
                Dagger dagger1 = new Dagger("dague", 10);
                Stick stick1 = new Stick("baton de magicien",20);


                Character best = guerrier1.winnerOfTheFight(mage1);
                System.out.println("");

                guerrier1.actionOn(mage1,sword1);
                System.out.println("");

                mage1.actionOn(pretre1,dagger1);
                System.out.println("");

                mage1.actionOn(guerrier1,stick1);
                System.out.println("");

                pretre1.actionOn(mage1,dagger1);
        }
}