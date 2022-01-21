package chapterFourAndFive;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner productNo = new Scanner(System.in);

        double totalSales = 0;
        int isAnySalesAvailable = 0;

        while (isAnySalesAvailable != -1){
            System.out.println("Enter the product number ");
            double productNumber = productNo.nextInt();
            System.out.println("Enter quantity sold ");
            int quantitySold = productNo.nextInt();

        productNumber = switch ((int) productNumber) {
            case 1 -> 2.98;
            case 2 -> 4.50;
            case 3 -> 9.98;
            case 4 -> 4.49;
            case 5 -> 6.87;
            default -> 0;
        };

        double productPrice = productNumber * quantitySold;
        totalSales+=productPrice;

        System.out.printf("The retail price is %s",productPrice);
            System.out.println();

        System.out.println("Input any number to continue or input -1 to end");
        isAnySalesAvailable = productNo.nextInt();
        }

        System.out.printf("The total sales for this period is %s",totalSales);
        }
    }

