package chapterFourAndFive;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean prime;
        int counter = 0;
        System.out.println("Enter number");
        int number = userInput.nextInt();

        for (int i = 2; i <= number; i++) {
            prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("The number of factor " + counter);
    }

}
