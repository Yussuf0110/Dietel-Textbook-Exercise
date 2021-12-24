package chapterThree;


import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        int milesDriven = 0;
        int totalMilesDriven = 0;
        int gallons = 0;
        int totalGallonsUsed = 0;
        double milesPerGallon = 0;
        double totalMPG = 0;
        int mpgCount = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter miles driven or -1 to quit: ");
        milesDriven = input.nextInt();


        while (milesDriven != -1) {
            System.out.println("Enter gallons or -1 to quit: ");
            gallons = input.nextInt();

            milesPerGallon = (double) milesDriven / gallons;
            mpgCount += 1;
            totalGallonsUsed += gallons;
            totalMilesDriven += milesDriven;
            totalMPG += milesPerGallon;

            System.out.printf("The MPG for this trip is %s", milesPerGallon);
            System.out.println("Enter miles driven: ");
            milesDriven = input.nextInt();
        }

        if (mpgCount != 0) {

            System.out.printf("The total miles driven is %s ", totalMilesDriven);
            System.out.println();
            System.out.printf("The MPG is %.2f", milesPerGallon);
            System.out.println();
            System.out.printf("The total MPG is  %s", totalMPG);
            System.out.println();
            System.out.printf("The total gallon Used is  %s", totalGallonsUsed);
        } else {
            System.out.println("Nothing input");
        }
    }
}

