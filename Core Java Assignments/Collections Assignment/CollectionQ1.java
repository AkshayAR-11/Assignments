import java.util.TreeMap;
public class CollectionQ1 {
	
//	1)	Given a TreeMap<Long, Contact> which has phone numbers for keys and contact objects for values.
//
//	Write solutions to 
//	a.	Fetch all the keys and print them, 
//	b.	Fetch all the values and print them
//	c.	Print all key-value pairs

	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 924318823, "Akshay");
		contact.put((long) 451268745, "Amlan");
		contact.put((long) 647789544, "Ayush");
		contact.put((long) 789546854, "Vignesh");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}