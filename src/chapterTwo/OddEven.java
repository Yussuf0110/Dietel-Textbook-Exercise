package chapterTwo;
//Answer to Exercise 2.26
//OddOrEven


import java.util.Scanner;

public class OddEven{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int a;

        System.out.print("Enter number ");
        a = input.nextInt();

        double number1 = a % 2;

        if (number1 == 0){
            System.out.println("The number is even");
        }
        if (number1 != 0){
            System.out.println("The number is odd");
        }
    }
}

