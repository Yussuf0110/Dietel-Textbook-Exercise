package chapterThree;

import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalEarned = 0;
        int inputAvailable = 0;


        while(inputAvailable != -5){
        System.out.println("Enter customer name: ");
        String customerName = input.nextLine();
        System.out.println("Enter hour parked: ");
        int hourParked = input.nextInt();


        double chargeIs = ParkingCharges.calculateParkingCharges(hourParked);
        System.out.printf("%s parking charges is %.2f\n ", customerName, chargeIs);

        totalEarned += chargeIs;

        System.out.println("Enter any number to continue or -5 to end ");
        inputAvailable = input.nextInt();

        }
        System.out.printf("The total of charges is %.5f", totalEarned);

    }


    public static double calculateParkingCharges(int hourParked) {
        double charges = 2;
        if (hourParked > 3) {
            charges += (hourParked - 3) * 0.5;
        }
        if (charges > 10) {
            charges = 10;
        }
        return charges;
    }

}
