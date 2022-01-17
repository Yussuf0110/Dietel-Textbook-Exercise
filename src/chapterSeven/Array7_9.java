package chapterSeven;

import java.util.Scanner;

public class Array7_9 {
    public static void main(String[] args) {
        //a
        int[][] t = new int[2][3];

        //g
        t[0][1] = 0;

        //h

        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        //i
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++)
//                t[i][j] = 0;
//        }

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.println("Enter input ");
                t[i][j] = input.nextInt();
            }
        }



            int smallest = t[0][0];
            for (int k = 0; k < t.length; k++) {
                for (int M = 0; M < t[k].length; M++)
                    if (t[k][M] < smallest)
                        smallest = t[k][M];
            }
                System.out.printf("%n%d is the small", smallest);


//l
        System.out.printf("%n%d %d %d ", t[0][0],t[0][1],t[0][2]);


//m
        int total = t[0][2] + t[1][2];
        System.out.printf("%d", total);

    }
}
