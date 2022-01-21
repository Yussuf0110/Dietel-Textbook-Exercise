package chapterSix;

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter co-ordinates (x1,x2,y1,y2 ): ");
        double x1 = userInput.nextDouble();
        double x2 = userInput.nextDouble();
        double y1 = userInput.nextDouble();
        double y2 = userInput.nextDouble();

        System.out.println(distance(x1,x2,y1,y2));
    }


    public static double distance(double x1,double x2,double y1,double y2){
        double result1 = Math.pow((x2 - x1),2);
        double result2 = Math.pow((y2 - y1),2);
        return Math.sqrt((result1 + result2));
    }
}
