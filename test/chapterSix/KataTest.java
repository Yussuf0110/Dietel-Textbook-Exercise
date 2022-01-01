package chapterSix;

import chapterThree.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {

    @Test
    public void GradeCalculation() {

        Kata gradeSomething = new Kata();
        char result = Kata.calculateGradeFor(98);
        assertEquals('A', result);
    }

    @Test
    public void bGradeCalculation() {

        Kata gradeSomething = new Kata();
        char result = Kata.calculateGradeFor(85);
        assertEquals('B', result);
    }

    @Test
    public void cGradeCalculation() {

        Kata gradeSomething = new Kata();
        char result = Kata.calculateGradeFor(59);
        assertEquals('C', result);

    }

    @Test
    public void dGradeCalculation() {

        Kata gradeSomething = new Kata();
        char result = Kata.calculateGradeFor(45);
        assertEquals('D', result);

    }

    @Test
    public void fGradeCalculation() {

        Kata gradeSomething = new Kata();
        char result = Kata.calculateGradeFor(5);
        assertEquals('F', result);
    }

}

    class DiscountPrices {

    @Test
    public void PriceList(){
    Kata thePrice = new Kata();
    int amount = thePrice.calculatePriceForQuantities(4);
    assertEquals(8000, amount);
    }


    @Test
    public void secondPriceList() {
        Kata thePrice = new Kata();
        int amount = thePrice.calculatePriceForQuantities(9);
        assertEquals(16200, amount);
        }

        @Test
        public void thirdPriceList() {
        Kata thePrice = new Kata();
        int amount = thePrice.calculatePriceForQuantities(29);
        assertEquals(46400, amount);
        }

        @Test
        public void fourthPriceList() {
            Kata thePrice = new Kata();
            int amount = thePrice.calculatePriceForQuantities(49);
            assertEquals(73500, amount);
        }

        @Test
        public void fifthPriceList() {
            Kata thePrice = new Kata();
            int amount = thePrice.calculatePriceForQuantities(99);
            assertEquals(128700, amount);
        }

        @Test
        public void sixthPriceList() {
            Kata thePrice = new Kata();
            int amount = thePrice.calculatePriceForQuantities(199);
            assertEquals(238800, amount);
        }

        @Test
        public void seventhPriceList() {
            Kata thePrice = new Kata();
            int amount = thePrice.calculatePriceForQuantities(499);
            assertEquals(548900, amount);
        }

        @Test
        public void eighthPriceList() {
            Kata thePrice = new Kata();
            int amount = thePrice.calculatePriceForQuantities(501);
            assertEquals(501000, amount);
        }
}



class InvoiceAmount{
    @Test
    public void calculateInvoiceAmount(){
        Invoice invoice1 = new Invoice("java", "net", 222, 111);
        double amount = invoice1.getInvoiceAmount(25,10.0);
        assertEquals(250, amount);
    }

    @Test
    public  void getTheName(){
        Invoice invoice1 = new Invoice("Sammy", "Messi", 10, 7);
        String name = invoice1.getDescription();
        assertEquals("Messi",name);
    }


@Test
    public void getTheAnnualSalary(){
    Employee employeeA = new Employee("Joseph", "AZ",10);
    double yearSalary = employeeA.annualSalary();
    assertEquals(120,yearSalary);
    double increaseSalary = employeeA.increaseSalary();
    assertEquals(132,increaseSalary);
}


@Test
    public void  getCharges(){
    ParkingCharges park1 = new ParkingCharges();
    double park = park1.calculateParkingCharges(5);
    assertEquals(3.00,park);
}
@Test
    public void getHypotenuse(){
    Hypotenuse test = new Hypotenuse();
    double result1 = test.hypotenuse(3.0,4.0);
    assertEquals(5,result1);
    double result2 = test.hypotenuse(5.0,12.0);
    assertEquals(13,result2);
    double result3 = test.hypotenuse(8.0,15.0);
    assertEquals(17,result3);
}


@Test
    public void checkMultiple(){
    Multiple test = new Multiple();
    boolean answer1 = test.isMultiple(2,4);
    assertTrue(answer1);
    boolean answer2 = test.isMultiple(9,3);
    assertTrue(answer2);
}


















}

class ArrayTotal{

    @Test
    public void calculateTotalOfArray() {
//        Kata total = new Kata();
       int [] numbers = {1,2,3};
////        int sum = Kata.calculateTotalOfArray(numbers);
//        assertEquals(6,sum);

    }






















}