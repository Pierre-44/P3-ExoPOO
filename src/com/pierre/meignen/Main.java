package com.pierre.meignen;

import com.pierre.meignen.Magus;
import com.pierre.meignen.Warrior;
import com.pierre.meignen.Priest;

public class Main {

        public static void main(String[] args) {
                Warrior guerrier1 = new Warrior();
                guerrier1.present();

                Magus Mage1 = new Magus();
                Mage1.present();

                Priest Pretre1 = new Priest();
                Pretre1.present();
        }
}