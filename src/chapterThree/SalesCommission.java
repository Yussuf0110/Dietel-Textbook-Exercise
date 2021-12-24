package chapterThree;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        double itemA = 239.99;
        double itemB = 129.75;
        double itemC = 99.95;
        double itemD = 350.89;
        double saleBonus = 0.09;
        int wages = 200;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Item A sold: ");
        int itemASold = input.nextInt();
        System.out.println("Enter number of Item B sold: ");
        int itemBsold = input.nextInt();
        System.out.println("Enter number of Item C sold: ");
        int itemCsold = input.nextInt();
        System.out.println("Enter number of Item D sold: ");
        int itemDsold = input.nextInt();


        double totalWeekSales = itemA*itemASold+itemB*itemBsold+itemC*itemCsold+itemD*itemDsold;
        double commission = saleBonus * totalWeekSales;
        double salary = commission + wages;

        System.out.printf("%s of itemA was sold %n%s of itemB was sold %n%s of itemC was sold %n%s of itemD was sold", itemASold,itemBsold,itemCsold,itemDsold );
        System.out.println();
        System.out.println("Your wage for the week is " +salary);






        }
    }




