class MyThread extends Thread {
    public MyThread(String name) {
        super(name); 
    }
    public void run() {
        System.out.println("Thread: " + getName() + ", Priority: " + getPriority() + ", running");
    }
}
public class ThreadPriorityExample {
    public static void main(String[] args) {
   
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");
        thread1.setPriority(Thread.MAX_PRIORITY); 
        thread2.setPriority(Thread.NORM_PRIORITY); 
        thread3.setPriority(Thread.MIN_PRIORITY); 
		
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Task extends Thread {
    public Task(String name, int priority) {
        super(name);
        setPriority(priority);
    }
    public void run() {
        System.out.println(getName() + " started with priority: " + getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " is executing task step: " + i);
            try {
                Thread.sleep(1000); // Simulate task execution time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " completed");
    }
}
public class ThreadPriorityExample {
    public static void main(String[] args) {
        Task highPriorityTask = new Task("High Priority Task", Thread.MAX_PRIORITY);
        Task mediumPriorityTask = new Task("Medium Priority Task", Thread.NORM_PRIORITY);
        Task lowPriorityTask = new Task("Low Priority Task", Thread.MIN_PRIORITY);
        highPriorityTask.start();
        mediumPriorityTask.start();
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lowPriorityTask.start();
    }
}
class Counter {
    private int count = 0;
    public synchronized void increment() {
        count++;
        System.out.println("Incremented: " + count);
    }
       public synchronized void decrement() {
        count--;
        System.out.println("Decremented: " + count);
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class DecrementThread extends Thread {
    private Counter counter;

    public DecrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.decrement();
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
