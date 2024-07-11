public class p19 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        IncrementThread incrementThread = new IncrementThread(counter);
        DecrementThread decrementThread = new DecrementThread(counter);

        incrementThread.start();
        decrementThread.start();

        BankAccount account = new BankAccount(1000);

        Thread thread1 = new TransactionThread(account, true, 500);
        Thread thread2 = new TransactionThread(account, false, 800);
        Thread thread3 = new TransactionThread(account, true, 300);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
