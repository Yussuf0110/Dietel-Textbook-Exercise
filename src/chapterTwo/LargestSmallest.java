package chapterTwo;
//Answer to Exercise 2.24
//LargestAndSmallest



import java.util.Scanner;

public class LargestSmallest{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int e;
        int largest;
        int smallest;

        System.out.println("Enter the first number ");
        a = input.nextInt();

        System.out.println("Enter the second number ");
        b = input.nextInt();

        System.out.println("Enter the third number ");
        c = input.nextInt();

        System.out.println("Enter the fourth number ");
        d = input.nextInt();

        System.out.println("Enter the fifth number ");
        e = input.nextInt();


        largest = a;
        if (b > largest)
            largest = b;
        if (c > largest)
            largest = c;
        if (d > largest)
            largest = d;
        if (e > largest)
            largest = e;
        System.out.printf("The largest is %d\n",largest);

        smallest = a;
        if (b < smallest)
            smallest = b;
        if (c < smallest)
            smallest = c;
        if (d < smallest)
            smallest = d;
        if (e < smallest)
            smallest = e;
        System.out.printf("The smallest is %d\n",smallest);
    }
}
