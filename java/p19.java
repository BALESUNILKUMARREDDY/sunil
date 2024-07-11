class BankAccount {
    private double balance;

     public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw: " + amount + " (Insufficient funds)");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class TransactionThread extends Thread {
    private BankAccount account;
    private boolean isDeposit;
    private double amount;

    public TransactionThread(BankAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class p19 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread thread1 = new TransactionThread(account, true, 500);
        Thread thread2 = new TransactionThread(account, false, 800);
        Thread thread3 = new TransactionThread(account, true, 300);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
