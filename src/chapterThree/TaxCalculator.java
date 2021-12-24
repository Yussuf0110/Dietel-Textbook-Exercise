package chapterThree;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        double tax;
        int earnings;
        String citizenName;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter citizen name: ");
        citizenName = input.nextLine();
        System.out.println("Enter earnings: ");
        earnings = input.nextInt();

        if (earnings > 30000) {
            tax = earnings * 0.20;
        } else {
            tax = earnings * 0.15;
        }

        System.out.printf("%s tax is %s ", citizenName, tax);


    }
}
