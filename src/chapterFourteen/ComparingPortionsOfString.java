package chapterFourteen;

import java.util.Scanner;

public class ComparingPortionsOfString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a 5 character word you want to compare: ");
        String firstInput = userInput.next();
        System.out.println("Enter a 5 character word you want to compare: ");
        String secondInput = userInput.next();

        regionMatchesForString(firstInput,secondInput);

    }



    public static void regionMatchesForString(String firstInput, String secondInput) {
        if(firstInput.regionMatches(true,0,secondInput,0,5)) {
            System.out.printf("%s is equal to %s ",firstInput,secondInput);
        }
        else {
            System.out.printf("%s is not equal to %s ",firstInput,secondInput);
        }
    }
}
