interface Animal
{
void eat();
void sleep();
}
interface Machine
{
void start();
void stop();
}
class Robot implements Animal,Machine
{
	public void eat()
	{
		System.out.println("robot consumes electricity");
	}
	public void sleep()
	{
		System.out.println("robot is in sleepmode");
	}
	public void start()
	{
		System.out.println("robot start");
	}
	public void stop()
	{
		System.out.println("robot stop");
	}
	public void work()
	{
		System.out.println("robot is working");
	}
}
public class p13
{
			public static void main(String args[])
			{
				Robot robot=new Robot();
				robot.eat();
				robot.sleep();
				robot.start();
				robot.stop();
				robot.work();
			}
}
		