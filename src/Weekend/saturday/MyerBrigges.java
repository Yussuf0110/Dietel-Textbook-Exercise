package Weekend.saturday;

import java.util.Scanner;

public class MyerBrigges {

    public static void options(){
        String options = """
                1. Strongly Agree
                2. Partially Agree
                3. Strongly Disagree
                4. Partially Disagree
                5. Not sure about this
                """;
        System.out.println(options);
    }

    public static void questions(){
        String [] questions = new String[7];
        questions[0] = "You spend a lot of your free time exploring various random topics that pique your interest.";
        questions[1] = "Seeing other people cry can easily make you feel like you want to cry too.";
        questions[2] = "You often make a backup plan for a backup plan.";
        questions[3] = "You usually stay calm, even under a lot of pressure.";
        questions[4] = "At social events, you rarely try to introduce yourself to new people and mostly talk to the ones you already know.";
        questions[5] = "You prefer to completely finish one project before starting another.";
        questions[6] = "You are very sentimental.";

        for(int i = 0; i <= questions.length; i++){
            System.out.println(questions[i]);
            options();
            displayUserChoices();
        }
    }

    public static void displayUserChoices(){
        Scanner userInput = new Scanner(System.in);


//        System.out.println(sAgreeCount);
//        System.out.println(pAgreeCount);
//        System.out.println(sDisagreeCount);
//        System.out.println(pDisagreeCount);
//        System.out.println(notSureCount);


    }

    public static void main(String[] args) {
        questions();
    }
}
