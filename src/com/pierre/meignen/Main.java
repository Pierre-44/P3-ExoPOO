package com.pierre.meignen;

import com.pierre.meignen.Magus;
import com.pierre.meignen.Warrior;
import com.pierre.meignen.Priest;

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


                Character best = guerrier1.winnerOfTheFight(mage1);

                guerrier1.actionOn(mage1);

                mage1.actionOn(pretre1);

                mage1.actionOn(guerrier1);

                pretre1.actionOn(mage1);
        }
}