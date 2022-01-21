package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    private static SecureRandom random = new SecureRandom();
    private static Scanner userAnswer = new Scanner(System.in);
    private static String [] goodResponses = {"Very good!",
            "Excellent!",
            "Nice work!",
            "Keep up the good work!"
    };

    private static String [] badResponses = {"No. Please try again.",
            "Wrong. Try once more.",
            "Don't give up!",
            "No. Keep trying."
    };

    public static void main(String[] args) {

        question();
    }


public static String responses(String[]array){
        int randomNumber = random.nextInt(array.length);
            return array[randomNumber];
}


public static void question(){

    int firstNumber = 1 + random.nextInt(9);
    int secondNumber = 1 + random.nextInt(9);
    int correctAnswer = firstNumber * secondNumber;
    int correctAnswer_count = 0;
    int wrongAnswer_count = 0;


    System.out.printf("What is %s multiply by %s ",firstNumber,secondNumber);
    int userInput = userAnswer.nextInt();

    while(userInput != correctAnswer){
        System.out.println(responses(badResponses));
        System.out.printf("What is %s multiply by %s ",firstNumber,secondNumber);
        userInput = userAnswer.nextInt();
        wrongAnswer_count+=1;
    }
    System.out.println(responses(goodResponses));
    question();
}
}