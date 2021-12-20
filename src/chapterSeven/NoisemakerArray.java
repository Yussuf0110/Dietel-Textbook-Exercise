package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class NoisemakerArray {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count;
        int  score;
        int[] grade = new int[2];
        double average;

        for (count = 0; count < grade.length; count++) {
            System.out.println("Enter a score: ");
            score = input.nextInt();
            total += score;

            if (score < min)
                min = score;
            if (score > max)
                max = score;

        }

        average = total / grade.length;


        System.out.println(Arrays.toString(grade));
        System.out.println("The total number is " + total);
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
        System.out.println("The average number is " + average);

    }
        }


