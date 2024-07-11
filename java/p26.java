import java.util.*; 
class p26
{ 
	public static void main(String args[]) 
	{ 
		ArrayList a = new ArrayList<Integer>(); 
		a.add(5);
		a.add(4); 
		a.add(3);
		a.add(8); 
		System.out.println("\n\n\tArray List : "+a); 
		HashSet hs= new HashSet(a); 
		System.out.println("\n\tHashSet : "+hs); 
		HashMap hm = new HashMap(); hm.put(11,"a"); 
		hm.put(22,"b"); 
		hm.put(33,"c"); hm.put(44,"d"); 
		System.out.println("\n\tHashMap : "); 
		System.out.println("\t\tValues : "+hm.values()); 
		System.out.println("\t\tKeys : "+hm.keySet()); 
		System.out.println("\t\tValue at the key 11 : "+hm.get(11)); 
	}
}