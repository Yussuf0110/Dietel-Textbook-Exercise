package chapterTwo;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

            double bmi;
            {

                System.out.print("Enter weight in kilograms ");
                Scanner input = new Scanner(System.in);
                int weightInKilograms = input.nextInt();

                System.out.print("Enter height in metres ");
                int heightInMetres = input.nextInt();

                bmi = weightInKilograms/ (heightInMetres * heightInMetres);
                System.out.println("BMI is " +bmi);

                if ( bmi < 18.5){
                    System.out.println("Underweight");
                }

                if ( bmi > 18.5 && bmi < 25){
                    System.out.println("Normal");
                }

                if ( bmi > 25 && bmi < 30){
                    System.out.println("Overweight");
                }

                if ( bmi > 30){
                    System.out.println("Obese");
                }
            }
        }

    }
