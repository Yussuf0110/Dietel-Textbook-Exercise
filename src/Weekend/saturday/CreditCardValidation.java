package Weekend.saturday;

import java.util.Scanner;

public class MyerBrigges {
    public static void main(String[] args) {

        String[] questions = {
                "A- expend energy,enjoy groups \nB- conserve energy,enjoy one-on-one",
                "A- intepret literally \nB- look for meaning and possibilities",
                "A- logical, thinking, questioning \nB- empathetic,feeling, accommodating",
                "A- organized,orderly \nB- feasible adaptable",
                "A- more outgoing, think out loud \nB- more reserved, think to yourself"
        };
        for (int i = 0; i < questions.length;i++) {
            Scanner userResponse = new Scanner(System.in);
            System.out.println(questions[i]);
            String userInput = userResponse.next();
            if (userInput != "A") {
                System.out.println("Wrong");
            }
            else if (userInput != "B") {
                System.out.println("Wrong");
            }
            else if (userInput == "A") {
                System.out.println("Right");
            }
            else if (userInput == "B") {
                System.out.println("Right");
            }


        }
    }
}
