package chapterEight;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Cylinder {
    public double radius = 1;
    public double height = 1;

    public static double calculateCylinderVolume(double radius, double height){
       return PI * (sqrt(radius) * sqrt(height));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            throw new IllegalArgumentException("Radius is negative which is not accepted");
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0){
            throw new IllegalArgumentException("Height is negative which is not accepted");
        }
        this.height = height;
    }


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius and height");
        double rad = input.nextDouble();
        double height = input.nextDouble();

        System.out.printf("The answer is %f",calculateCylinderVolume(rad,height));


    }
}
