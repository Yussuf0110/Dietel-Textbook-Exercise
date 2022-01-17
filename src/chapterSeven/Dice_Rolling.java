package chapterSeven;

import java.security.SecureRandom;
//Chapter 6.10

public class Dice_Rolling {
    public static void main(String[] args) {
        SecureRandom randomDie = new SecureRandom();

        int total_Die_Rolled = 0;
        int [] die_Rolling = new int [13];


        for (int i = 0; i < 36_000_000; i++){
            int rollDice1 = 1 + randomDie.nextInt(6);
            int rollDice2 = 1 + randomDie.nextInt(6);
            total_Die_Rolled = rollDice1 + rollDice2;
            die_Rolling[total_Die_Rolled]++;
        }

        System.out.println("Outcome\t\tNo Rolled");

        for (int i = 0; i < die_Rolling.length; i++){
        System.out.printf("%3d\t%12d\n",i,die_Rolling[i]);
    }
    }
}
