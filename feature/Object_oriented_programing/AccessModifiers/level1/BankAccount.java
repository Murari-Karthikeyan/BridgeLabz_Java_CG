class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    // Public methods for private balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }
}

// Subclass demonstrating access
class SavingsAccount extends BankAccount {

    SavingsAccount(int accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance: " + getBalance());         // private via method
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(55501, "Rohit", 12000);
        sa.displayAccountDetails();
    }
}
