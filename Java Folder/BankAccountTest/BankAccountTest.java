//https://github.com/vishhaldawane/KPITOCT2023

public class BankAccountTest {
    public static void main(String args[]) {
        // Creating BankAccount objects
        BankAccount bankAccObj1 = new BankAccount(101, "Jack", 25000.0f);
        BankAccount bankAccObj2 = new BankAccount(102, "Jane", 27000.0f);
        BankAccount bankAccObj3 = new BankAccount(103, "Jin", 29000.0f);

        // Printing the address of the objects
        System.out.println("bankAccObj1 : " + bankAccObj1);
        System.out.println("bankAccObj2 : " + bankAccObj2);
        System.out.println("bankAccObj3 : " + bankAccObj3);

        // Calling methods in BankAccount class
        bankAccObj1.showbankAccount();
        bankAccObj2.showbankAccount();
        bankAccObj3.showbankAccount();

        bankAccObj1.deposit(25000);
        bankAccObj2.deposit(27000);
        bankAccObj3.deposit(29000);

        bankAccObj1.showbankAccount();
        bankAccObj2.showbankAccount();
        bankAccObj3.showbankAccount();

        bankAccObj1.withdraw(3000);
        bankAccObj2.withdraw(7000);
        bankAccObj3.withdraw(9000);

        bankAccObj1.showbankAccount();
        bankAccObj2.showbankAccount();
        bankAccObj3.showbankAccount();
    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    // method to display the Account Details
    void showbankAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Balance : " + accountBalance);
        System.out.println("-------------------------");
    }

    void withdraw(double amountToWithdraw) {
        System.out.println(accountHolderName + " is withdrawing..." + amountToWithdraw);
        accountBalance = accountBalance - amountToWithdraw;
    }

    void deposit(double amountToDeposit) {
        System.out.println(accountHolderName + " is Depositing..." + amountToDeposit);
        accountBalance = accountBalance + amountToDeposit;
    }
}