package chapterFourAndFive;

import java.util.Scanner;

//public class Sentinel {
//    public static void main(String[] args) {
//        int total = 0;
//        int score = 0;
//
//        do {total = total + score;
//        System.out.println("Enter a score");
//        Scanner scanner = new Scanner(System.in);
//        score = scanner.nextInt();
//    }
//    while (score < 100 && score > 1);
//        System.out.println("Result is " +total);
//
//    }
//}

public class Sentinel {
    public static void main(String[] args) {
        int mis = 0;
        int courseno = 0;

        do {
            mis = mis + courseno;
            System.out.println("Enter courseno");
            Scanner input = new Scanner(System.in);
            courseno = input.nextInt();
        }
        while (courseno < 5);

        System.out.println("Done");



    }
}