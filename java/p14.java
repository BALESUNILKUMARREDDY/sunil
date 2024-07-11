public class p14{
	public static void main(String args[])
	{
		try{
			int result=divide(10,0);
			System.out.println("Result is"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("errror:division by 0");
		}
	}
	public static int divide(int divident,int divisor)
	{
		return divident/divisor;
	}
}