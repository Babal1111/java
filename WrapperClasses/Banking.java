class BankAccount {
    private int accountNumber;
    private Integer dailyLimit;
    private Integer withdrawnAmount;

    public int getAccountNumber() { return accountNumber; }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }

    public Integer getDailyLimit() { return dailyLimit; }
    public void setDailyLimit(Integer dailyLimit) { this.dailyLimit = dailyLimit; }

    public Integer getWithdrawnAmount() { return withdrawnAmount; }
    public void setWithdrawnAmount(Integer withdrawnAmount) { this.withdrawnAmount = withdrawnAmount; }
}

class TransactionValidator {

    public boolean isTransactionAllowed(BankAccount account, Integer transactionAmount) {
        if (transactionAmount == null) {
            return false;
        }
        int totalAfterTxn = account.getWithdrawnAmount() + transactionAmount;
        return totalAfterTxn <= account.getDailyLimit();
    }

    public void updateWithdrawal(BankAccount account, Integer transactionAmount) {
        account.setWithdrawnAmount(account.getWithdrawnAmount() + transactionAmount);
    }
}

public class Solution {
    public static void main(String[] args) {

        TransactionValidator validator = new TransactionValidator();

        BankAccount a1 = new BankAccount();
        a1.setAccountNumber(101);
        a1.setDailyLimit(20000);
        a1.setWithdrawnAmount(15000);

        BankAccount a2 = new BankAccount();
        a2.setAccountNumber(102);
        a2.setDailyLimit(20000);
        a2.setWithdrawnAmount(18000);

        BankAccount a3 = new BankAccount();
        a3.setAccountNumber(103);
        a3.setDailyLimit(20000);
        a3.setWithdrawnAmount(10000);

        process(a1, 3000, validator);
        process(a2, 3000, validator);
        process(a3, null, validator);
    }

    private static void process(BankAccount account, Integer amount, TransactionValidator validator) {
        if (amount == null) {
            System.out.println("Account " + account.getAccountNumber() + " --> Invalid Transaction Amount");
            return;
        }

        if (validator.isTransactionAllowed(account, amount)) {
            validator.updateWithdrawal(account, amount);
            System.out.println("Account " + account.getAccountNumber() + " --> Transaction Approved");
        } else {
            System.out.println("Account " + account.getAccountNumber() + " --> Transaction Declined (Limit Exceeded)");
        }
    }
}
