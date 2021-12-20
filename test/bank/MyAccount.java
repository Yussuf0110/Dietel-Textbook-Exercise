package bank;

public class MyAccount {
    private String accountName;
    private String pin;
    private int balance = 50_000;

    public MyAccount (String accountName, String pin) {
        this.accountName = accountName;
        this.pin = pin;
    }

    public String getAccountName() {
        return "Lionel Messi";
    }

    public int getAccountBalance() {
        return balance;
    }
    }
