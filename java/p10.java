class p10 
{ 
	public static void main(String args[]) 
	{ 
		B b = new B(); 
		b.show(); 
		b.display(); 
	} 
} 
abstract class A 
{ 
	abstract void show(); 
	void display() 
	{ 
		System.out.println("\n\tAbstractNon abstract method in abstract class "); 
	} 
} 
class B extends A 
{ 
	void show() 
	{ 
		System.out.println("\n\tAbstract method defined in the sub class"); 
	} 
}