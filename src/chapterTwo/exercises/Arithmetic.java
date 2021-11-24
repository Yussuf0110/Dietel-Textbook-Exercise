package chapterTwo.exercises;// Exercise 2.15
// Arithmetic program that input two numbers to display the sum, product, difference and quotient.

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;
        int product;
        int division;
        int difference;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        System.out.println("Sum is " + sum);

        product = number1 * number2;
        System.out.println("Multi is " + product);

        division = number1 / number2;
        System.out.println("Qoutient is " + division);

        difference = number1 - number2;
        System.out.println("Difference is " + difference);
    }
}



