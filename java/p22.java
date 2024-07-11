import java.io.*;

class Person implements Serializable 
{
    String name;
    transient String password; 
    Person(String name, String password) 
	{
        this.name = name;
        this.password = password;
    }
    @Override
    public String toString() 
	{
        return "Person{name='" + name + "', password='" + password + "'}";
    }
}
public class p22 
{
    public static void main(String[] args) 
	{
        Person person = new Person("John Doe", "securePassword123");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) 
		{
            oos.writeObject(person);
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) 
		{
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person: " + deserializedPerson);
        } 
		catch (IOException | ClassNotFoundException e) 
{
            e.printStackTrace();
        }
    }
}