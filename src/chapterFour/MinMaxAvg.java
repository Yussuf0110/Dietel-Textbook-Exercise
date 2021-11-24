package chapterFour;

import java.util.Scanner;

public class MinMaxAvg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0;
        int countNumber = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int number = 0;
        double average = 0.0;

        while (count < 10) {
            System.out.println("Enter number: ");
             number = input.nextInt();

            if (number<min)
                min = number;
            if (number>max)
                max=number;

            total = total + number;
            count++;
            }

        countNumber = countNumber + 1;
        average = total / count ;
            System.out.println("The average number is " +average);
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
        System.out.println("The total number is " +total);
    }



    }

