package chapterSix;

import chapterThree.Employee;
import chapterThree.Invoice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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