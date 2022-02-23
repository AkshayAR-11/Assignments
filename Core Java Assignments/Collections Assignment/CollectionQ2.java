import java.util.HashSet;

//2)	Write an application to store 10 unique product objects. In case there is an attempt to add a duplicate product, it should be silently rejected. Hint: Use HasSet or TreeSet
//
//Extra(optional): Use ArrayList in the above solution. (This is optional

public class CollectionQ2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Nike");
		hs.add("Puma");
		hs.add("Adidas");
		hs.add("Reebok");
		hs.add("UnderArmour");
		
		System.out.println("Original");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("Puma");
		hs.add("Reebok");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs);
		System.out.println(hs.size());
	}

}