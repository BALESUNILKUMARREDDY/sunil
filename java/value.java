class P7 {
    public static void main(String args[]) {
        P7 ob = new P7();
        char a = ob.returnChar('A');
        System.out.println("Returned value: " + a);
    }

    char returnChar(char c) {
        System.out.println("Passed value: " + c);
        c++;
        return c;
    }
}
