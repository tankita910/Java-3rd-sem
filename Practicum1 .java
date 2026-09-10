public class BankAccountDemo {
    static class BankAccount {
        String accountHolderName, accountType;
        long accountNumber;
        double accountBalance;
        BankAccount(String name, long number, String type, double balance) {
            accountHolderName = name;
            accountNumber = number;
            accountType = type;
            accountBalance = balance;
        }
        void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid deposit amount");
                return;
            }
            accountBalance += amount;
            System.out.println("Deposited: " + amount);
        }
        void withdraw(double amount) {

            if (amount <= 0) {
                System.out.println("Invalid withdraw amount");
                return;
            }
            if (amount > accountBalance) {
                System.out.println("Insufficient Balance");
            } else {
                accountBalance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
        }
        void balanceEnquiry() {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account No: " + accountNumber +
                               " Type: " + accountType);
            System.out.println("Balance: " + accountBalance);
        }
    }
    public static void main(String[] args) {
        BankAccount acc =
            new BankAccount("Ravi", 1001, "Savings", 10000);
        acc.balanceEnquiry();
        acc.deposit(5000);
        acc.withdraw(3000);
        acc.withdraw(15000);
        acc.deposit(0);
        acc.deposit(-500);
        acc.withdraw(0);
        acc.balanceEnquiry();
    }
}

