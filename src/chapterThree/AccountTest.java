package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Lionel Messi", 10.0);
        Account account2 = new Account("Xavi Adam", 20.00);

        System.out.printf("%s balance: #%.2f%n", account1.getAccountName(),account1.getBalance());
        System.out.printf("%s balance: #%.2f%n", account2.getAccountName(),account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.println("Enter withdraw amount ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%ndeducting %.2f from account1 balance %n%n", withdrawAmount);
        account1.withdraw(withdrawAmount);
        System.out.println(account1.getBalance());

        System.out.println("Enter deposit amount ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        System.out.println(account1.getBalance());


    }




}
