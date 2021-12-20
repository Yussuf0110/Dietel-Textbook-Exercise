package chapterFourAndFive;

import java.util.Scanner;

public class EncyptCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();


        {
            int newnumber1 = ((number1 + 7)%10);
            int newnumber2 = ((number2 + 7)%10);
            int newnumber3 = ((number3 + 7)%10);
            int newnumber4 = ((number4 + 7)%10);

            System.out.print("The new digits are " +newnumber3+ " " +newnumber4+ " " +newnumber1+ " " +newnumber2);
        }
    }
}