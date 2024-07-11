public class p21 {
    static int count = 0;
    static {
        System.out.println("Static block executed.");
        count++;
    }
    static void displayCount() {
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        displayCount();
        count++;
        displayCount();
    }
}
