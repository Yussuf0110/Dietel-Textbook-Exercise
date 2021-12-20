package chapterTwo.exercises;
//Answer to Exercise 2.28
//CircleCalculationimport java.util.Scanner;


import java.util.Scanner;

public class CircleCalculation{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        int radius = input.nextInt();

        System.out.printf("Diameter of a circle is %d \n", 2 * radius);

        System.out.printf("Diameter of a circle is %f \n", 2 * 3.14159 * radius);

        System.out.printf("Diameter of a circle is %f \n" ,3.14159 * radius * radius);


    }
}

