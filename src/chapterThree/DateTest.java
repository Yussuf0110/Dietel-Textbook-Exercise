package chapterThree;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date firstDate = new Date(22,12,2020);

        System.out.println(firstDate.getDay());
        System.out.println(firstDate.getMonth());
        System.out.println(firstDate.getYear());
        firstDate.displayDate();
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day ");
        int days = input.nextInt();
        firstDate.setDay(days);
        System.out.println("Enter month ");
        int month = input.nextInt();
        firstDate.setMonth(month);
        System.out.println("Enter year ");
        int year = input.nextInt();
        firstDate.setYear(year);

        firstDate.displayDate();






    }




}
