package chapterFourAndFive;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom guessNumber = new SecureRandom();

        int guess = 1 + guessNumber.nextInt(5);
        int counter = 0;



        System.out.println("Guess the number:");
        int userInput = input.nextInt();

        while (userInput != guess) {
            userInput = input.nextInt();
            if (userInput < guess) {
                System.out.println("Too low.Try again");
            } else if (userInput > guess){
                System.out.println("Too high");
            }
            else {
                System.out.println("Congratulations !!!");
            }
            counter+=1;
        }
        if(counter <= 10){
            System.out.println("Either you know the secret or you got lucky!");
        }
        else {
            System.out.println("You should be able to do better! Why should it take no more than 10 guesses?");
        }
    }
}


