package chapterFourAndFive;

import java.util.Scanner;

public class FindFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;

        int factorCounter = 0;

        System.out.println("Enter number: ");
        int number = input.nextInt();

        for (count = 1; count <= number; count++) {
            if (number % count == 0) {
                factorCounter++;
                System.out.printf("%d Factor are %d%n", count, number);
            }
        }
        System.out.printf(String.valueOf(factorCounter));
    }
}

