package chapterFourAndFive;

public class PatternA {
    public static void main(String[] args) {
        for (int i=1;i<=6;i++) {
            for (int k=1; k<=i;k++)
                System.out.print(k+ " ");
            System.out.println();
        }
    }
}
