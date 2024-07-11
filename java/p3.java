import java.util.Scanner;
class p3
{
	public static void main(String[] args)
	{
		System.out.println("FOR LOOP");
		for(int i=0;i<5;i++)
		{
		System.out.println("i= "+i);
		}	
		System.out.println("WHILE LOOP");
		int i=0;
		while(i<5)
		{
			System.out.println("i= "+i);
			i++;
		}
		System.out.println("DO-WHILE LOOP");
		i=0;
		do
		{
			System.out.println("i= "+i);
			i++;
		}
		while(i<5);
	}
}