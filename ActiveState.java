public class ActiveState implements AccountState{
    public void deposit(Account account, Double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        account.toString();
    }
    public void withdraw(Account account, Double withdrawAmount) {
        if (account.getBalance() >= withdrawAmount)
        account.setBalance(account.getBalance() - withdrawAmount);
        else
        System.out.println("Insufficient Balance.");
        
        account.toString();
    }
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }
    public void suspend(Account account) {
        System.out.println("Account is suspended!");
        account.setAccountState(new SuspendedState());
    }
    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setAccountState(new ClosedState());
    }
}