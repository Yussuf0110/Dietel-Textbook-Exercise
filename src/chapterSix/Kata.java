package chapterSix;

public class Kata {


    public static char calculateGradeFor(int score) {
        if (score>89) return 'A';
        if (score>69) return 'B';
        if (score>49) return 'C';
        if (score>39) return 'D';
        return 'F';
    }

    public int calculatePriceForQuantities(int quantity) {
        int price = 0;

        if (quantity < 5) {
             price = quantity * 2000;
           return price;
        }

        if (quantity < 10) {
             price = quantity * 1800;
            return price;
        }

        if (quantity < 30) {
            price = quantity * 1600;
            return price;
        }

        if (quantity < 50) {
            price = quantity * 1500;
            return price;
        }

        if (quantity < 100) {
            price = quantity * 1300;
            return price;
        }

        if (quantity < 200) {
            price = quantity * 1200;
            return price;
        }

        if (quantity < 500) {
            price = quantity * 1100;
            return price;
        }

        if (quantity > 500) {
            price = quantity * 1000;
            return price;
        }



        return price;
    }
}
