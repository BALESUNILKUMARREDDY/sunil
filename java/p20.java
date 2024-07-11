import java.util.Scanner;
public class p20{
	public static void main(String[] args)
	{
		Scanner Scanner=new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=Scanner.nextLine();
		System.out.print("Enter your age:");
		int age=Scanner.nextInt();
		System.out.println("Hello,"+name+"!you are "+age+" years old.");
	}
}