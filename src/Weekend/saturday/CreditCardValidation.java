package Weekend.saturday;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCardValidation {

    public static int[] convertToArray (String ccNumber){
        int[] ccInArray = new int[ccNumber.length()];

        for (int i = 0;i < ccNumber.length();i++){
            char cc = ccNumber.charAt(i);
            ccInArray[i] = Integer.parseInt(""+cc);
        }
        return ccInArray;
    }

//    public boolean isValid (int [] ccNumber){
//        if (getSize(ccNumber) >= 13 && getSize(ccNumber) <= 16) && getPrefix(ccNumber) || getPrefix(ccNumber))
//
//    }

    public boolean getPrefix(int [] ccNumber,int d) {
        return  ccNumber[0] == d;
    }



    public int getSize(int [] ccNumber){
        return  ccNumber.length + 1;
    }


    public static int [] getDigit (int [] ccNumber){
        int [] updatedList = new int[ccNumber.length];

        for (int i =0; i < ccNumber.length; i++){
          int  product =  ccNumber[i] * 2;
           if (product > 9){
               int nn = product % 10 + 1;
               updatedList[i] = nn;
           }
           else
           {
               updatedList[i] = product;
           }
        }
        return updatedList;
    }





    public static int sumOfDoubleEvenPlace(int [] number){
        int sumOfEven = 0;
        for (int i = number.length - 2; i >= 0; i = i - 2) {
        int product = i * 2;
        if (product > 9){
            int nn = product % 10 + 1;
            sumOfEven+=nn;
        }
        else {
            sumOfEven +=product;
        }
        }
return sumOfEven;
    }



    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your credit card");
        String ccNumber = userInput.next();
        int [] newArr = convertToArray(ccNumber);
        int [] newUpdate = getDigit(newArr);
        System.out.println(Arrays.toString(newUpdate));
        System.out.println(sumOfDoubleEvenPlace(newUpdate));



    }
}