package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) 
	{
		Map<Integer, String> Map=new HashMap<Integer, String>();
		Map.put(100, "asit");
		Map.put(101, "saurav");
		Map.put(102, "payal");
		Map.put(103, "anjali");
		Map.put(104, "sudarsan");
		
		System.out.println("asit -->>"+Map.get(102));
		
		for (Integer EachKey: Map.keySet())
		{
			System.out.println(Map.get(EachKey));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
