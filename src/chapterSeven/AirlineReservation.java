package chapterSeven;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.fill;

public class AirlineReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[] seats = new boolean[10];

        for (int i = 0; i < seats.length; i++) {
            fill(seats, false);
        }

        String reservation = """
                Please type 1 for First Class
                Please type 2 for Economy Class
                """;
        System.out.println(reservation);
        int userResponse = input.nextInt();
        switch (userResponse) {
            case 1:
                System.out.println(Arrays.toString(airlineBooking(userResponse)));
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + userResponse);
        }
    }
    public static boolean[] airlineBooking(int classChosen){
        Random random = new Random();
        boolean [] seats = new boolean[10];
        for (int i = 0; i < seats.length;i++){
            fill(seats,false);
        }

        if (classChosen == 1){
            for (int i = 0; i < seats.length - 5;i++){
                int firstClass = 1 + random.nextInt(5);
                seats[firstClass - 1] = true;
            }
        }

        return seats;

    }
}