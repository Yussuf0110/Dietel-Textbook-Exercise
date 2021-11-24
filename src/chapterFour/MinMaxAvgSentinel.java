package chapterFour;

import java.util.Scanner;

public class MinMaxAvgSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number = 0;
        int count = 0;


        do {
            total = total + number;
            System.out.println("Enter numbers: ");
            number = input.nextInt();
            count++;

            if (number == -42)
                break;
            if (max < number)
                max = number;
            if (min > number)
                min = number;

        }
        while
        (number != -42);

        double average = total / (count -1);

        System.out.println("The total number is " +total);
        System.out.println("The average number is " +average);
        System.out.println("The maximum number is " +max);
        System.out.println("The minimum number is " +min);
    }
}
