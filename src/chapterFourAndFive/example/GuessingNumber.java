package chapterFourAndFive.example;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int counter = 1;
        int guess = 59;
        int number = 0;

        for (i = 0; i <= 1000; i++) {

            System.out.println("Guess the number:");
            number = input.nextInt();

            switch (number) {
                case 1:
                    if (number > guess) {
                        System.out.println("Too high,try again");
                    } else if (number < guess) {
                        System.out.println("Too low,try again");
                    } else if (number == guess) {
                        System.out.print("Congratulations"
                                + "You guessed the number.");
                        break;
                    }
            }
        }
    }
}

