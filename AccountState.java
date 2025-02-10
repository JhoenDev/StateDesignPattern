public interface AccountState {
    public void deposit(Account account, Double depositAmount);
    public void withdraw(Account account, Double withdrawAmount);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);
}