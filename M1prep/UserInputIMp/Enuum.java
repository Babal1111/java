
import java.util.Scanner;

enum TransactionType {
    DEPOSIT,
    WITHDRAWAL,
    TRANSFER
}

class Account {
    String accountNo;
    double currBal;

    public Account(String accountNo, double currBal) {
        this.accountNo = accountNo;
        this.currBal = currBal;
    }

    public void applyTransaction(int amount, TransactionType transactionType) {
        if (transactionType == TransactionType.DEPOSIT) {
            currBal += amount;
            System.out.print("Deposit of " + amount + " successful. Balance: ");
            displayBalance();
        } else if (transactionType == TransactionType.WITHDRAWAL) {
            if (currBal >= amount) {
                currBal -= amount;
                System.out.print("Withdrawal of " + amount + " successful. Balance: ");
                displayBalance();
            } else {
                System.out.println("Withdrawal failed due to insufficient balance");
            }
        } else if (transactionType == TransactionType.TRANSFER) {
            if (currBal >= amount) {
                currBal -= amount;
                System.out.print("Transfer of " + amount + " successful. Balance: ");
                displayBalance();
            } else {
                System.out.println("Transfer failed due to insufficient balance");
            }
        }
    }

    public void displayBalance() {
        System.out.println((int) currBal);
    }
}

class Transaction {
    String transactionId;
    TransactionType transactionType;
    int amount;

    public Transaction(String transactionId, TransactionType transactionType, int amount) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }
}

class TransactionService {
    public void executeTransaction(Account account, Transaction transaction) {
        account.applyTransaction(transaction.amount, transaction.transactionType);
    }
}

public class Enuum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt(); // number of test cases
        TransactionService ts = new TransactionService();

        while(t-->0){
            System.out.println("Enter Accno and intialBalance");
            String accno = sc.next();
            double bal = sc.nextDouble();
            System.out.print("Enter th number of transactions: ");
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
            Account a1 = new Account(accno, bal);
            System.out.println("Enter The Transaction Id and Type of Treansaction in capitals DEPOSIT/WITHDRAW/TRANSFER nad amount");
            String transactionId = sc.next();
            String type = sc.next();
            type = type.toUpperCase();
            int amount = sc.nextInt();

            TransactionType transactionType = TransactionType.valueOf(type);
            Transaction t1 = new Transaction(transactionId, transactionType,amount);
            ts.executeTransaction(a1, t1);

        }
    }
        sc.close();
    }
}
