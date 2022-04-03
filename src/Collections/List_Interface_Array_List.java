package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Interface_Array_List {

	public static void main(String[] args) 
	{
		List<String> List=new ArrayList<String>();
		List.add("one");
		List.add("two");
		List.add("three");
		List.add("four");
		List.add("five");
		List.add("six");
		List.add("two");
		
		List.remove("one");
		
		
		int Count=List.size();
		System.out.println("List collection size -->>"+Count);
		
		boolean flag=List.contains("three");
		System.out.println("List Collection contains Three -->>"+flag);
		
		String Next_Itr_value=List.iterator().next();
		System.out.println("next iterator value is -->>"+Next_Itr_value);
		
		//List.clear();
		
		boolean flag1=List.isEmpty();
		System.out.println("collection empty status is-->>"+flag1);
		
		for (String EchObj: List) 
		{
			System.out.println(EchObj);
		}
		
		Iterator<String> Itr2=List.iterator();
		System.out.println("1st Iterator is -->>"+Itr2.next());
		System.out.println("1st Iterator is -->>"+Itr2.next());
		System.out.println("1st Iterator is -->>"+Itr2.next());
		
		
		while (Itr2.hasNext())
		{
			String Each_Itr_Obj=Itr2.next();
			System.out.println(Each_Itr_Obj);
		}
		
		String Index_Obj=List.get(3);
		System.out.println("Object in index no 3 is-->>"+Index_Obj);
		
		for (int i = 0; i < List.size(); i++)
		{
			String Index_No_Obj=List.get(i);
			System.out.println("index wise obj  location -->>"+Index_No_Obj);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
