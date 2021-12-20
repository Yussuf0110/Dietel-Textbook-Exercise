package chapterTwo.exercises;
import java.util.Scanner;

public class NumberSeperation{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int lastNumber;

        System.out.print("Enter a number with 5 digits: ");
        int number = input.nextInt();

        if(number / 10000 == 0 || ( number % 10000) / 1000 == 0){
            System.exit(1);
        }
        firstNumber =  number / 10000;
        secondNumber = ( number % 10000) / 1000;
        thirdNumber = (( number % 10000) % 1000) / 100;
        fourthNumber = ((( number % 10000) % 1000) % 100) / 10;
        lastNumber = ((( number % 10000) % 1000) % 100) % 10;

        System.out.printf("%d%s%d%s%d%s%d%s%d%n", firstNumber, " ", secondNumber, " ", thirdNumber, " ", fourthNumber, " ", lastNumber);
    }
}