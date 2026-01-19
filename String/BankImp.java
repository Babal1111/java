public class BankImp {
    public static void main(String[] args) {

        String transaction =
                "ACC: 9876543210 | TYPE: Debit | AMOUNT: 4500 | BALANCE: 3800";

        BankTransactionProcessor processor =
                new BankTransactionProcessor(transaction);

        System.out.println("Account Number : " + processor.getMaskedAccount());
        System.out.println("Transaction    : " + processor.getTransactionType());
        System.out.println("Amount         : " + processor.getAmount());
        System.out.println("Balance        : " + processor.getBalance());
        System.out.println("Low Balance?   : " + processor.isLowBalance());
    }
}

class BankTransactionProcessor {

    String record;

    BankTransactionProcessor(String record) {
        this.record = record;
    }

    String getAccountNumber() {
        int start = record.indexOf("ACC:") + 5;
        int end = record.indexOf("|", start);
        return record.substring(start, end).trim();
    }

    String getTransactionType() {
        int start = record.indexOf("TYPE:") + 6;
        int end = record.indexOf("|", start);
        return record.substring(start, end).trim();
    }

    int getAmount() {
        int start = record.indexOf("AMOUNT:") + 8;
        int end = record.indexOf("|", start);
        return Integer.parseInt(record.substring(start, end).trim());
    }

    int getBalance() {
        int start = record.indexOf("BALANCE:") + 9;
        return Integer.parseInt(record.substring(start).trim());
    }

    String getMaskedAccount() {
        String acc = getAccountNumber();
        int len = acc.length();
        return "XXXXXX" + acc.substring(len - 4);
    }

    boolean isLowBalance() {
        return getBalance() < 5000;
    }
}
