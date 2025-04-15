import java.util.*;

public class hashmap{
	public static void main(String[]args)
	{
		HashMap<String,Double> hm=new HashMap<String,Double>();  //string is key and double is value

		hm.put("astha",(3404.01));   //we can use directly
		hm.put("dwija",(5214.55));
		hm.put("ishi",(5645.88));

		Set<Map.Entry<String,Double>> set=hm.entrySet();  //map.entry=one ley,value pair,me is just a variable for each entry in loop
		//hm.entryset  returns all key,value pair , set is set of map.entry
		for(Map.Entry<String,Double>me:set)
		{
			System.out.print(me.getKey()+" ");  //get key
			System.out.println(me.getValue()+" ");  //get value
		}  

		System.out.println();

		double balance=hm.get("astha");//it get astha from map and also the value(3404.01)
		hm.put("astha",balance+1000);  //for update the value
		System.out.println("astha's new balance:"+hm.get("astha"));
	}
}