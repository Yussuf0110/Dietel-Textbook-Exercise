package chapterFourAndFive;

public class PatternB {
    public static void main(String[] args) {
//
//        1                                                           1
//        1 2                                                       2 1
//        1 2 3                                                   3 2 1
//        1 2 3 4                t                              4 3 2 1
//        1 2 3 4 5                                           5 4 3 2 1
//        1 2 3 4 5 6                                       6 5 4 3 2 1


    for (int i=1;i<=6;i++) {
            for (int k=1; k<=i;++k)
                System.out.print( " " +k);
            System.out.println();
        }

    }
}
