package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_list_And_Linked_List {

	public static void main(String[] args) 
	{
long Start=System.currentTimeMillis();
		
		List<String> List=new ArrayList<String>();
		List.add("one");
		List.add("two");
		List.add("three");
		List.add("four");
		List.add("five");
		List.add("six");
		List.add("two");
		
		List.remove("one");
		
		long Time_Taken=System.currentTimeMillis()-Start;
		System.out.println("time taken -->>"+Time_Taken);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
