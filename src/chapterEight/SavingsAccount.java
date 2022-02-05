package chapterEight;

public class SavingsAccount {
    public static double annualInterest;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
            this.savingsBalance = savingsBalance;
    }


    public double calculateMonthlyInterest(){
        return (savingsBalance * annualInterest)/12;
    }

    public double savingsBalance() {
        return savingsBalance + calculateMonthlyInterest();
    }

    public static void modifyInterest(double newInterest){
    annualInterest = newInterest;
    }





    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterest(0.04);

        System.out.printf("Saver1 monthly interest is %f\n",saver1.calculateMonthlyInterest());
        System.out.printf("Saver2 monthly interest is %f\n",saver2.calculateMonthlyInterest());
        System.out.printf("Saver1 saving balance is %f\n",saver1.savingsBalance());
        System.out.printf("Saver2 saving balance is %f\n",saver2.savingsBalance());

        SavingsAccount.modifyInterest(0.05);

        System.out.printf("Saver1 monthly interest is %f\n",saver1.calculateMonthlyInterest());
        System.out.printf("Saver2 monthly interest is %f\n",saver2.calculateMonthlyInterest());
        System.out.printf("Saver1 saving balance is %f\n",saver1.savingsBalance());
        System.out.printf("Saver2 saving balance is %f\n",saver2.savingsBalance());
    }
}