package HomeTask.lection9;//Task 3

import java.util.ArrayList;

public class Account {
    ArrayList<AccountBalance> accountHistory = new ArrayList<>();
    void addAccountOperation (int moneyWithdraw, int payments, int moneyIncome) {
        AccountBalance newOperation = new AccountBalance(moneyWithdraw, payments, moneyIncome);
        accountHistory.add(newOperation);
    }
    static class AccountBalance {
        int moneyWithdraw;
        int payments;
        int moneyIncome;
        public AccountBalance (int moneyWithdraw, int payments, int moneyIncome) {
            this.moneyWithdraw = moneyWithdraw;
            this.payments = payments;
            this.moneyIncome = moneyIncome;
        }
    }
}