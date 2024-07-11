class Life extends Thread {
    public void run() {}

    public static void main(String args[]) {
        Life a = new Life();
        System.out.println(a.getState());
        a.start();
        System.out.println(a.getState());
        System.out.println(a.isAlive());

        try 
		{
            Thread.sleep(2000);
        } 
		catch (Exception e) {}

        System.out.println(a.getState());
        System.out.println(a.isAlive());
    }
}