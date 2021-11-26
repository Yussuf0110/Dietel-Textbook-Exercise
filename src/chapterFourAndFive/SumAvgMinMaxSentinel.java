package chapterFourAndFive;

import java.util.Scanner;

public class SumAvgMinMaxSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int number = 0;
        int sum = 0;
        int avg = 0;
        int min = 0;
        int max = 0;
        do {
            sum = sum + number;}
        while (number < 100 && number > 1) ;



        for (int i = 0; i < 10; i++) {
            number = input.nextInt();
            if (max < number)
                max = number;
            if (min > number)
                min = number;
            else
                avg = number;
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
        System.out.println("Average number is " + avg);
        System.out.println("Sum is " + sum);
    }
}
