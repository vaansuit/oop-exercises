public class CheckingAccount {

    private String clientName;
    private int accountNumber;
    private float balance;

    public CheckingAccount(String clientName, int accountNumber, float balance) {
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public CheckingAccount(String clientName, int accountNumber) {
        this(clientName, accountNumber, 0);
    }

    public void changeClientName(String newName) {
        this.clientName = newName;
    }

    public void deposit(float value) {
        this.balance =+ value;
    }

    public String getClientName() {
        return clientName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void withdraw( float value) {
        if (value > this.balance) {
            System.out.println("Insuficient founds");
        } else {
            this.balance -= value;
        }
    }

}
