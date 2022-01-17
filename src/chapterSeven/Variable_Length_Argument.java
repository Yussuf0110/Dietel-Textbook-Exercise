package chapterSeven;

public class Variable_Length_Argument {
    public static void main(String[] args) {
        System.out.println(average(1, 2, 3, 4, 5, 7));


    }


    public static double average(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return (double) total / numbers.length;
    }
}