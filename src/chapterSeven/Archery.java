package chapterSeven;

import java.security.SecureRandom;

public class Archery {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int [][] playerPoints = new int[4][3];


        for (int i = 0; i < playerPoints.length; i++) {
            for (int j = 0; j < playerPoints[i].length; j++) {
        int points = randomNumber.nextInt(10);
                playerPoints[i][j] = points;
            }
        }

        System.out.println("Player\t1stScore\t2ndScore\t3rdScore");









        int player1= playerPoints[0][0] + playerPoints[0][1] + playerPoints[0][2];
        int player2= playerPoints[1][0] + playerPoints[1][1] + playerPoints[1][2];
        int player3= playerPoints[2][0] + playerPoints[2][1] + playerPoints[2][2];
        int player4= playerPoints[3][0] + playerPoints[3][1] + playerPoints[3][2];

        System.out.printf("Player 1 total score is %d " , player1);




    }
}
