package chapterSix;

import java.util.Scanner;

public class KataII {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        int score;

        System.out.print("Enter your score: ");
        score = input.nextInt();

        TestKataMethod rat = new TestKataMethod();
        System.out.println(rat.setGrades(score));
    }
    }


