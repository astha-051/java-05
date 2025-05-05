import java.util.*;

public class hashmapscratch{

	static class Hashmap<k,v>  //<k,v>->generics ,when we don't know about type of variable we can declare it as generics
	{
		private class Node{
			k key;
			v value;

			Node(k key,v value)
			{
				this.key=key;
				this.value=value;
			}
		}

		private int n;  //n->total nodes
		private int N; //N=total buckets
		private LinkedList<Node> buckets[];   //LinkedList<Node>->type of an array
		
		@SuppressWarnings("unchecked")  //gives warning

		public Hashmap()
		{
			this.N=4;
			this.buckets=new LinkedList[4];  //array intialize
			for(int i=0;i<4;i++)
			{
				this.buckets[i]=new LinkedList<>();  //create new linkedlist for all buckets and staying null
			}
		}


		public int  hashfunction(k key)
		{
			int bi=key.hashCode();  //gives a value like 45466123 -6453214
			return Math.abs(bi) % N; //we want only positive  value and index like 0,1,to N-1
		}
		private int searchinLL(k key,int bi)
		{
			LinkedList<Node> ll=buckets[bi];  //bi index stores that linkedlist

			for(int i=0;i<ll.size();i++)
			{
				if(ll.get(i).key == key)  //travle whole linkedlist to serach the index
				{
					return i;//data index
				}
			}
			return -1;
		}
		@SuppressWarnings("unchecked")    //for warning
		private void rehash()
		{
			LinkedList<Node>  oldbuckets[]=buckets;
			buckets=new LinkedList[N*2];

			for(int i=0;i<N*2;i++)
			{
				buckets[i]=new LinkedList<>();  //create new null linkedlist
			}

			for(int i=0;i<oldbuckets.length;i++)
			{
				LinkedList<Node>ll=oldbuckets[i];

				for(int j=0;j<ll.size();j++)
				{
					Node node=ll.get(j);
					put(node.key,node.value);
				}
			}
		}

		public void put(k key,v value)
		{
			int bi=hashfunction(key);  //gives us array index
			int di=searchinLL(key,bi);   //gives us linkedlist index
			//di=(0+)->key exist di=-1->key does not exist

			if(di==-1)
			{
				buckets[bi].add(new Node(key,value));
				n++;  //size increase
			}
			else 
			{
				Node data=buckets[bi].get(di);
				data.value=value;  //change the value by current value
			}

			double lambda=(double)n/N;
			if(lambda>2.0)
			{
				//rehashing
				rehash();
			}
		}

		public boolean comtainskey(k key)
		{
			int bi=hashfunction(key);  //gives us array index
			int di=searchinLL(key,bi);   //gives us linkedlist index
			//di=(0+)->key exist di=-1->key does not exist

			if(di==-1)
			{
				return false;
			}
			else 
			{
				return true;
			}
		}

		public v remove(k key)
		{
			int bi=hashfunction(key);  //gives us array index
			int di=searchinLL(key,bi);   //gives us linkedlist index
			//di=(0+)->key exist di=-1->key does not exist

			if(di==-1)
			{
				return null;
			}
			else 
			{
				Node data=buckets[bi].remove(di);
				n--;
				return data.value;  //removed index value  
			}
		}

		public v get(k key)
		{
			int bi=hashfunction(key);  //gives us array index
			int di=searchinLL(key,bi);   //gives us linkedlist index
			//di=(0+)->key exist di=-1->key does not exist

			if(di==-1)
			{
				return null;
			}
			else 
			{
				Node data=buckets[bi].get(di);
				return data.value;  
			}
		}
		public boolean isEmpty()
		{
			return n==0;  //if n==0 than hashmap  is empty
		}
		public ArrayList<k> keyset()
		{
			ArrayList<k> keys=new ArrayList<>();

			for(int i=0;i<buckets.length;i++)  //bi
			{
				LinkedList<Node> ll=buckets[i];

				for(int j=0;j<ll.size();j++)  //di
				{
					Node node=ll.get(j);
					keys.add(node.key);
				}
			}

			return keys;
		}

	}
	public static void main(String[]args)
	{
		Hashmap<String,Integer> hm=new Hashmap<>();

		hm.put("india",100);
		hm.put("US",200);
		hm.put("canada",300);

		ArrayList<String> keys=hm.keyset();
		for(int i=0;i<keys.size();i++)
		{
			System.out.println(keys.get(i)+" "+hm.get(keys.get(i)));  //print index and value  in arraylist
		}

		hm.remove("india");
		System.out.println(hm.get("india"));
	}
}