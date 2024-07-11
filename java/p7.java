//import java.lang.System;
class p7 {
    int x = 100;
    public static void main(String args[])
	{
        p7 ob = new p7();
		p7 ob1 = new p7();
        char a = ob.retrn('A'); 
        System.out.println("\n\nReturned value: " + a);
        p7 p7= ob.pass(ob1);
        System.out.println("\n\nReturned object: " + p7.x + "\n");
    }
    p7 pass(p7 obj)
	{
        System.out.println("\n\nPassed object: " + obj.x);
        obj.x = 1000;
        return obj;
    } 
    char retrn(char c) 
	 {
        System.out.println("\n\nPassed value: " + c);
        c++;
        return(c);
    }
}
 