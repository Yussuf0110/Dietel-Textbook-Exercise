package chapterThree;

public class Multiple {

    public static boolean isMultiple(int x, int y) {
        double division = y % x;
        double division2 = x % y;
        boolean answer;
        if (division == 0 || division2 == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }


    public static void squareAsterisks(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++)
                System.out.print('*');
                System.out.println();
            }
        }

        public static void squareOfCharacters(int number,char character){
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++)
                System.out.print('#');
            System.out.println();
        }
    }

    public static void leapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 == 0)
                    System.out.printf("The year %d is a leap year " , year);
            }
        }
        else {
            System.out.printf("The year %d is not a leap year ", year);
        }
    }

    public static void kelvin(double celsius){
        double kelvin = celsius + 237.5;
        System.out.println(kelvin);
    }

    public static void celsius(double kelvin){
        double celsius = kelvin - 237.5;
        System.out.println(celsius);
    }













    }