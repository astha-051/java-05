import java.util.*;

public class hashmap01{
	public static void main(String[]args)
	{
		HashMap<String,Integer> map=new HashMap<>();

		map.put("india",100);
		map.put("us",120);
		map.put("china",200);

		System.out.println(map);

		map.put("india",150);  //one key another value
		System.out.println(map);

		//search
		if(map.containsKey("india"))
		{
			System.out.println("exist");
		}
		else 
		{
			System.out.println("does not exist");
		}

		System.out.println(map.get("china"));  //value of key
		System.out.println(map.get("pakistan"));

		int arr[]={10,11,12};
 
		for(int value : arr)  //array returns value not the index and that value stores in value variable
		{
			System.out.print(value + " ");
		}
		System.out.println();
		for(Map.Entry<String,Integer> e: map.entrySet())
		{
			System.out.print(e.getKey());
			System.out.println();
			System.out.println(e.getValue());
		}

		map.remove("china");
		System.out.println(map);
	}
}