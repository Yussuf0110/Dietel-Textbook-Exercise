package chapterSix;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        String options = """
                press 1 to toss coin
                press 2 to exit
                """;
        System.out.println(options);
        System.out.println("Select of the options above ");
        int userResponse = userInput.nextInt();

        if (userResponse == 1) {
            String inputOptions = """
                    Enter number of times you want to toss the coin """;
            System.out.println(inputOptions);
            int timesToTossCoin = userInput.nextInt();
            CoinTossing.flipCoin(timesToTossCoin);
        }
        else if (userResponse == 2 ) {
            System.exit(userResponse);
        }
        else
         {
            throw new IllegalStateException("Unexpected value: " + userResponse);
        }
    }

        public static void flipCoin(int timesToTossCoin){
            int headcount = 0;
            int tailcount = 0;

            for (int i = 0; i < timesToTossCoin; i++) {
                int coinToss = CoinTossing.flip();
                switch (coinToss) {
                    case 1 -> {
                        headcount += 1;
                    }
                    case 2 -> {
                        tailcount += 1;
                    }
                }
            }
            System.out.printf("Head was tossed %s times \n", headcount);
            System.out.printf("Tail was tossed %s times", tailcount);
        }





    public static int flip() {
        Random random = new Random();
        return 1 + random.nextInt(2);
    }
}


