package chapterThree;

public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double balance){
        this.accountName = accountName;

        if (balance > 0.0)
            this.balance=balance;
        }


    public String getAccountName(){
        return accountName;
    }

    public void setAccountName(String newName) {
        this.accountName = accountName;
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
        else
            System.out.println("Amount not recognised");
    }

    public double getBalance()
    {
        return balance;
    }

    public double withdraw(double withdrawAmount){
        if(withdrawAmount <= balance) {
            System.out.println("Withdraw successful");
            balance-=withdrawAmount;
        }
    else
            System.out.println("Insufficient Balance ");

    return balance;
}

    public  static void displayAccount(Account account){
    System.out.printf("%s has a balance of #%.2f%n", account.getAccountName(), +account.getBalance());
}



}
