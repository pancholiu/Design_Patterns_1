package introduction;

public class Account {

    public Account() {}

    public float balance;

    public void deposit(float amount) {
        if(amount > 0)
            this.balance += amount;
    }

    public void withdraw(float amount) {
        if(amount > 0)
            balance -= amount;
    }

    public float getBalance() {
        return balance;
    }
}
