package chapterTwo.exercises;
//Answer to Exercise 2.27
//MultipleOfNumber

import java.util.Scanner;

public class MultipleOfNumber
{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number");
        System.out.print("Enter second number");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int fig = number1 % number2;

        if (fig == 0){
            System.out.printf("%d is a mutiple of %d", number1, number2);
        }

        else if (fig != 0){
            System.out.printf("%d is not a multiple of %d", number1, number2);
        }
    }
}
