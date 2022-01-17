package chapterFourAndFive;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean primee;
        int counter = 0;

        for (int i = 2; i <= 10; i++) {
            primee = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primee = false;
                    break;
                }
            }
            if (primee) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("The number of factor " + counter);
    }
}
