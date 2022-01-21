package chapterTwo;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        System.out.println("Enter 5 digits numbers ");
        int number = input.nextInt();

        a =  number / 10000;
        b = ( number % 10000) / 1000;
        c = (( number % 10000) % 1000) / 100;
        d = ((( number % 10000) % 1000) % 100) / 10;
        e = ((( number % 10000) % 1000) % 100) % 10;


        if( a == e){
            if( b == d){
                System.out.println("The numbers are Palindrome ");
            }
        }
        else
            System.out.println("The numbers are not Palindrome ");
    }
}