public class SuspendedState implements AccountState{
    public void deposit(Account account, Double depositAmount) {
        System.out.println("You cannot deposit on a suspended account!");
    }
    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("You cannot withdraw on a suspended account!");
    }
    public void activate(Account account) {
        System.out.println("Account is activated!");
        account.setAccountState(new ActiveState());
    }
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }
    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setAccountState(new ClosedState());
    }
}