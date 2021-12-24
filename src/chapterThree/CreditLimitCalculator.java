package chapterThree;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        int accountNumber;
        int balanceAtTheBeginning;
        int totalItemsCharged;
        int creditForTheMonth;
        int creditLimit;
        int newBalance;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Account Number ");
        accountNumber = input.nextInt();
        System.out.println("Enter Opening Balance");
        balanceAtTheBeginning = input.nextInt();
        System.out.println("Enter Total Items Charged ");
        totalItemsCharged = input.nextInt();
        System.out.println("Enter customer Credit for the month  ");
        creditForTheMonth = input.nextInt();
        System.out.println("Enter Credit Limit for customer ");
        creditLimit = input.nextInt();

        newBalance = balanceAtTheBeginning + totalItemsCharged - creditForTheMonth;


            if(newBalance > creditLimit) {
                System.out.println("Credit limit exceeded ");
            }
            else
            {
                System.out.printf("%s new Balance is %s ", accountNumber, newBalance);
            }
    }
}