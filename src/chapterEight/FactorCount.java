package chapterEight;

import java.util.Scanner;

public class FactorCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int userInput = input.nextInt();

        int answer = factorialCount(userInput);
        System.out.printf("The number of factors in %s is %s",userInput,answer);

    }


    public static int factorialCount(int userInput) {
        int factorCounter = 0;

        for (int count = 1; count <= userInput; count++) {
            if (userInput % count == 0) {
                factorCounter++;
            }
        }
        return factorCounter;
    }
}

