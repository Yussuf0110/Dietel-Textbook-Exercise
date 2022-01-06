package Weekend;

import chapterThree.Multiple;

import java.security.SecureRandom;
import java.util.Scanner;

public class Saturday{

//    public Saturday(String name, int age, double grades, char gradesV) {
//    }
//
//    public static void main(String[] args) {
//        Saturday ogun = new Saturday("Dembele",25,5.5, 'B');
//
//
//    }


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//// randomNumbers object will produce secure random numbers
//        SecureRandom randomNumbers = new SecureRandom();
//// loop 20 times
//        for (int counter = 1; counter <= 20; counter++) {
//// pick random integer from 1 to 6
//            int face = 1 + randomNumbers.nextInt(6);
//            System.out.printf("%d ", face);
//                            // display generated value
//// if counter is divisible by 5, start a new line of output
//            if (counter % 5  == 0) {
//                System.out.println();
//            }
//        }
//    }

        // randomNumbers object will produce secure random numbers
//        SecureRandom randomNumbers = new SecureRandom();
//        int frequency1 = 0;     //count of 1s rolled
//        int frequency2 = 0;     //count of 2s rolled
//        int frequency3 = 0;
//        int frequency4 = 0;
//        int frequency5 = 0;
//        int frequency6 = 0;
//
//// tally counts for 60,000,000 rolls of a die
//        for (int roll = 1; roll <= 60_000_000; roll++) {
//            int face = 1 + randomNumbers.nextInt(6); // number from 1 to 6
//// use face value 1-6 to determine which counter to increment
//            switch ( face ) {
//                case 1:
//                    ++frequency1; // increment the 1s counter
//                    break;
//                case 2:
//                    ++frequency2; // increment the 2s counter
//                    break;
//                case 3:
//                    ++frequency3; // increment the 3s counter
//                    break;
//                case 4:
//                    ++frequency4; // increment the 4s counter
//                    break;
//                case 5:
//                    ++frequency5; // increment the 5s counter
//                    break;
//                case 6:
//                    ++frequency6; // increment the 6s counter
//                    break;
//            }
//        }
//        System.out.println("Face\tFrequency"); // output headers
//        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
//                frequency1, frequency2, frequency3, frequency4,
//                frequency5, frequency6);
//    }

//
//        int x;
//        double y = Math.floor(9 + 0.5);
//        System.out.println(y);



//            Exercise 5.11 (c)
//        SecureRandom randomNumbers = new SecureRandom();
//        int n = 1 + randomNumbers.nextInt(7);
//        System.out.println(n);

//            Exercise 5.11 (a)
//        SecureRandom randomNumbers = new SecureRandom();
//        int n = 2 + randomNumbers.nextInt(6);
//        System.out.println(n);

//            Exercise 5.11 (b)
//                SecureRandom randomNumbers = new SecureRandom();
//        int n = 4 + randomNumbers.nextInt(50);
//        System.out.println(n);


        //            Exercise 5.11 (d)
//                SecureRandom randomNumbers = new SecureRandom();
//        int n = -1 + randomNumbers.nextInt(1);
//        System.out.println(n);


//        //            Exercise 5.12 (a)
        SecureRandom randomNumber = new SecureRandom();
//        int n = 2 + 3 * randomNumber.nextInt(5);
//        System.out.println(n);
//
//        for (int i = 0; i <= 14; i++){
//           double n = 2 + 3 * randomNumber.nextInt();
//            System.out.println(n);
//        }

//        DecryptCrypto floor = new DecryptCrypto();
//        System.out.println("Enter double number: ");
//        double numbersample = input.nextDouble();
//
//       double t = DecryptCrypto.myFloor(numbersample);
//        System.out.println(t);
//        double w = DecryptCrypto.myFloor2(numbersample);
//        System.out.println(w);
//
//        double u = DecryptCrypto.myCeil(numbersample);
//        System.out.println(u);
//        double v = DecryptCrypto.myCeil2(numbersample);
//        System.out.println(v);


//        System.out.println("Enter int ");
//                int i = input.nextInt();
//        System.out.println("Enter double ");
//                double d = input.nextInt();
//input.nextLine();
//        System.out.print("Enter string ");
//                String s = input.nextLine();
//
//
//                // Write your code here.
//
//
//                System.out.println("String: " + s);
//                System.out.println("Double: " + d);
//                System.out.println("Int: " + i);

//            System.out.println("Enter number ");
//            int N = input.nextInt();
//        for(int i = 1;i <= 10;i++){
//            int result = N * i;
//            1System.out.printf("%d x %d = %d", N,i,result);
//            System.out.println();
//        }

//        System.out.println(Multiple.isMultiple(201,4));

//        System.out.println("Enter number ");
//        int number = input.nextInt();
//        Multiple.squareAsterisks(number);
//        Multiple.squareOfCharacters(3,'#');


//        System.out.println("enter year ");
//        int year = input.nextInt();
//        Multiple.leapYear(year);


        System.out.println("Enter celsius ");
        double celsius = input.nextDouble();
        Multiple.kelvin(celsius);
        System.out.println("Enter kelvin ");
        double kelvin = input.nextDouble();
        Multiple.celsius(kelvin);











            }
        }
