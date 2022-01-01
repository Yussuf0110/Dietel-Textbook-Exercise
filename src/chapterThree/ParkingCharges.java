package chapterThree;

import java.util.Scanner;

public class ParkingCharges {

    public static void main(String[] args) {
        double totalEarned = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer name: ");
        String customerName = input.nextLine();
        System.out.println("Enter hour parked or -1 to quit: ");
        int hourParked = input.nextInt();


        double chargeIs = ParkingCharges.calculateParkingCharges(hourParked);
        System.out.printf("%s parking charges is %.2f ", customerName, chargeIs);

        System.out.println();

        totalEarned += chargeIs;
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
