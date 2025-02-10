public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActiveState();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void deposit(Double depositAmount) {
        accountState.deposit(this, depositAmount);
    }

    public void withdraw(Double withdrawAmount) {
        accountState.deposit(this, withdrawAmount);
    }

    public void suspend() {
        accountState.suspend(this);
    }

    public void activate() {
        accountState.activate(this);
    }

    public void close() {
        accountState.close(this);
    }


    // displays account number and balance
    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: " + balance;
    }
}
