class p9 
{ 
	public static void main(String args[]) 
	{
		ConstructorOverloading ob1=new ConstructorOverloading();
		ConstructorOverloading ob2=new ConstructorOverloading(2);
		ConstructorOverloading ob3=new ConstructorOverloading(2,5);
		
		ob1.display();
		ob2.display();
		ob3.display();
	}
}
class ConstructorOverloading
{
	int x,y;
	ConstructorOverloading()
	{
		x=0;
		y=0;
	}
	ConstructorOverloading(int xval)
	{
		x=xval;
		y=0;
	}
	ConstructorOverloading(int xval,int yval)
	{
		x=xval;
		y=yval;
	}
	void display()
	{
		System.out.println("x="+x+"y="+y+"\n");
	}
}
