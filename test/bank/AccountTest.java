package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    private MyAccount messiAccount = new MyAccount("Lionel Messi", "1905");

    @Test
    public void accountCreation () {
        String nameOfAccount = messiAccount.getAccountName();
        assertEquals("Lionel Messi", nameOfAccount);
    }

    @Test
    public void getBalance () {
        int accountBalance = messiAccount.getAccountBalance();
        assertEquals(50_000, accountBalance);
    }

//    @Test
//    public void getDeposit() {
//        int deposit = messiAccount.getDeposit();
//
//    }
}
