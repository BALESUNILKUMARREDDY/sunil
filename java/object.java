class p7 {
    int x = 100;

    public static void main(String[] args) {
        p7 ob = new p7();
        p7 ob1 = new p7();
        p7 result = ob.returnchar(ob1);
        System.out.println("Returned object is: " + result.x);
    }

    p7 returnchar(p7 obj) {
        System.out.println("Passed object is: " + obj.x);
        obj.x = 1000;
        return obj;
    }
}
