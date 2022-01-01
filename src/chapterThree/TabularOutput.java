package chapterThree;

public class TabularOutput {
    public static void main(String[] args) {

        int n2;
        int n3;
        int n4;
        int counter = 1;

        System.out.println("\tN  \tN2 \tN3 \tN4  ");
        while (counter < 5) {
            n2 = counter * counter;
            n3 = n2 * counter;
            n4 = n3 * counter;

            counter++;
            System.out.printf("\t%s \t%s \t%s \t%s  ", counter, +n2, +n3, +n4);
            System.out.println();

        }


    }
    }


