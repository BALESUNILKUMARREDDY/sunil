import java.util.*;
class p8
 {
    public static void main(String args[]) 
	{
        System.out.println("method overloading");
        A a = new A();
        a.show();
        a.show(5);
        System.out.println("method overriding");
        B b = new B();
        b.show();
    }
}
class A 
	{
    void show()
		{
			System.out.println("show() with null param in A");
		}
    void show(int x) 
		{
			System.out.println("show() with int param in A:" + x);
		}
   }
class B extends A 
	{
		void show() 
		{
        System.out.println("show() with null param in B:");
		}
	} 