package chapterThree;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int number = 0;
        int counter = 0;
        int largest = number;

        Scanner input = new Scanner(System.in);

        while (counter < 3) {
            System.out.println("Enter number: ");
            number = input.nextInt();
            counter++;

            if (number > largest){
                largest = number;

        }

        }
            System.out.printf("%s is the largest number", largest);



    }

}
