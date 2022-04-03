package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface_HashSet {

	public static void main(String[] args) 
	{
		
		Set<String> Set=new HashSet<String>();
		Set.add("one");
		Set.add("two");
		Set.add("three");
		Set.add("four");
		Set.add("five");
		Set.add("six");
		Set.add("two");
		
		Set.remove("one");
		
		
		int Count=Set.size();
		System.out.println("set collection size -->>"+Count);
		
		boolean flag=Set.contains("three");
		System.out.println("Set Collection contains Three -->>"+flag);
		
		String Next_Itr_value=Set.iterator().next();
		System.out.println("next iterator value is -->>"+Next_Itr_value);
		
		//Set.clear();
		
		boolean flag1=Set.isEmpty();
		System.out.println("collection empty status is-->>"+flag1);
		
		for (String EchObj: Set) 
		{
			System.out.println(EchObj);
		}
		
		Iterator<String> Itr2=Set.iterator();
		System.out.println("1st Iterator is -->>"+Itr2.next());
		System.out.println("1st Iterator is -->>"+Itr2.next());
		System.out.println("1st Iterator is -->>"+Itr2.next());
		
		
		while (Itr2.hasNext())
		{
			String Each_Itr_Obj=Itr2.next();
			System.out.println(Each_Itr_Obj);
		}
		
		
		
		
		
		
	}

}
