import java.io.*;
import java.util.*;
class exp25
{
	public static void main(String args[]) throws FileNotFoundException
	{
    System.out.println("Before setProperties method="+System.getProperty("user.dir"));
    Properties p = System.getProperties();
    p.put("user.dir", "this/is/the/new/user/dir/path");
    System.setProperties(p);
    System.out.println("After setProperties method="+System.getProperty("user.dir"));
    }
}