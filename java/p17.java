class p17 extends Thread {
    p17 t1;

    public void run() {
        System.out.println("\n3- Running state");
        for (int i = 0; i < 5; i++) {
            if (i == 1) {
                try {
                    System.out.println("\n4- Blocked state");
                    Thread.sleep(10);
                    System.out.println("\nResuming...");
                } catch (InterruptedException e) {
                    System.err.println("Interrupted while sleeping: " + e.getMessage());
                }
            }
        }
    }

    void show() {
        System.out.println("\n1- NewBorn state");
        t1 = new p17();
        System.out.println("\n\n" + t1 + "\n");
        System.out.println("\n2- Runnable state");
        t1.start();
    }

    public static void main(String args[]) {
        p17 ob = new p17();
        ob.show();
    }
}
