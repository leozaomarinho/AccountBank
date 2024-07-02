package AccountBank.entities;

public class BusinessAccount extends Account {
    private double loanLimit;

    public BusinessAccount(String accountNumber, double initialBalance, double loanLimit) {
        super(accountNumber, initialBalance);
        this.loanLimit = loanLimit;
    }

    public void requestLoan(double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Loan Limit: " + loanLimit;
    }
}

