package chapterThree;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice newInvoice = new Invoice("11", "Sandal", 10, 88);
        Invoice newInvoice2 = new Invoice("55", "Wendy", 44, 22);


        Scanner input = new Scanner(System.in);
        System.out.println(newInvoice);
        System.out.println("Enter name ");
        String theDescription = input.nextLine();
        System.out.println("Enter number ");
        String theNumber = input.nextLine();
        System.out.println("Enter quantity ");
        int theQuantity = input.nextInt();
        System.out.println("Enter price ");
        int thePrice = input.nextInt();


        newInvoice.setDescription(theDescription);
        System.out.println(newInvoice.getDescription());

        newInvoice.setNumber(theNumber);
        System.out.println(newInvoice.getNumber());

        newInvoice.setQuantityItemPurchased(theQuantity);
        System.out.println(newInvoice.getQuantityItemPurchased());

        newInvoice.setPricePerItem(thePrice);
        System.out.println(newInvoice.getPricePerItem());

        System.out.println(newInvoice.getInvoiceAmount(theQuantity, thePrice));
    }
}
