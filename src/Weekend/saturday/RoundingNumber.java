package Weekend.saturday;

import java.util.Scanner;

public class RoundingNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter x value ");
        double x = input.nextDouble();

        double y = Math.floor(x + 0.5);
        double z = Math.floor(x * 10 + 0.5)/10;
        double a = Math.floor(x * 100 + 0.5)/100;
        double b = Math.floor(x * 1000 + 0.5)/1000;

        System.out.printf("%s is converted to nearest integer %s%n" , x,y);
        System.out.printf("%s is converted to tenth %s%n" , x,z);
        System.out.printf("%s is converted to hundred %s%n" , x,a);
        System.out.printf("%s is converted to thousand %s%n" , x,b);

    }

}
