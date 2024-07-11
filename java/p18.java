class MyThread extends Thread 
{
    public MyThread(String name) 
	{
        super(name);
    }

    public void run() 
	{
        System.out.println("Thread:" + getName() + ", priority:" + getPriority() + ", running");
    }
}

public class p18 
{
    public static void main(String[] args) 
	{
        MyThread thread1 = new MyThread("Thread1");
        MyThread thread2 = new MyThread("Thread2");
        MyThread thread3 = new MyThread("Thread3");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
