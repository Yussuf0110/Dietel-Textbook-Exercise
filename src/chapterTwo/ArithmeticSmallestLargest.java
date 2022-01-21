package chapterTwo;

// Exercise 2.17
// Program that input two numbers to display the sum, average, product, smallest and largest of numbers.
import java.util.Scanner;

public class ArithmeticSmallestLargest{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int sum;
        int average;
        int product;

        System.out.print("Enter first number ");
        a = input.nextInt();

        System.out.print("Enter second number ");
        b = input.nextInt();

        System.out.print("Enter third number ");
        c = input.nextInt();

        sum = a + b + c;
        System.out.println("The sum is " + sum);

        average = sum / 3;
        System.out.println("The average is " + average);

        product = a * b * c;
        System.out.println("The product is " + product);

        if ((a < b) && (a < c)) {
            System.out.println("the smallest is " + a);
        }

        if ((a > b) && (a > c)) {
            System.out.println("the largest is " + a);
        }

        if ((c < b) && (c < a)){
            System.out.println("the smallest is " + c);
        }

        if ((c > b) && (c > a)) {
            System.out.println("the largest is " + c);
        }

    }
}
