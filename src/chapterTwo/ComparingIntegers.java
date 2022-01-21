package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    // Exercise 2.16
    // Comparing Integer

        public static void main(String[]args){

            Scanner input = new Scanner(System.in);

            int number1;
            int number2;


            System.out.println("Enter first number: ");
            number1 = input.nextInt();

            System.out.println("Enter second number: ");
            number2 =input.nextInt();

            if (number1 > number2)
                System.out.printf("%d is larger than %d\n",number1,number2);

            if (number1 < number2)
                System.out.printf("%d is larger than %d\n", number2, number1);

            if (number1 == number2)
                System.out.println("These numbers are equal");

        }
    }