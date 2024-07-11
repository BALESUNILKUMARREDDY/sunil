import java.util.*;
class exp26{
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("\nVolkswagen");
        list.add("Toyota");
        list.add("Porschn");
        list.add("Ferrari");
        list.add("Audi");
        list.add("Mercedes-Bennz");
        list.add("Rolls-Royce");
        list.add("BMW");
        System.out.println("Before Sorting:"+ list);
        Collections.sort(list);
        System.out.println("After Sorting:" + list);
    }
}