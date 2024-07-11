 import java.io.*;

class p15 {
    public static void main(String args[]) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try 
		{
            System.out.print("\n\n\tInput a string : ");
            String s = br.readLine();
            throw new ArithmeticException(); 
        }
		catch (ArithmeticException ie) 
		{
            System.out.println("\n" + ie);
        }
		catch (NullPointerException ie) 
		{
            System.out.println(ie);
        }
		finally
		{
            System.out.println("\n\nInitiating garbage collection ...\n");
            System.gc();
        }
    }
}
  