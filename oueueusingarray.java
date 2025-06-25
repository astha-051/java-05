public class oueueusingarray{

	static class queue1{
		static int arr[]; //don't know the size
		static int size;
		static int rear=-1;  //now the queue is empty and don't need to define front because its zero


		queue1(int size)
		{
			arr=new int[size];
			this.size=size;
		}

		public static boolean isEmpty()
		{
			return rear==-1;
		}

		public static void add(int data)
		{
			if(rear == size-1)  //queue is full
			{
				System.out.println("queue is full(add)");
				return;
			}
			rear++;  //when you add elements rear  goes to next index
			arr[rear]=data;  //store on next index
		}

		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("queue is full");
				return -1;
			}

			int front=arr[0];  //removes from start

			for(int i=0;i<rear;i++)
			{
				arr[i]=arr[i+1];  //0=blank space now,move another elements front 
			}
			rear--;  //rear's index goes -
			return front;
		}

		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("empty queue");
				return -1;
			}

			return arr[0];
		}
	}
	public static void main(String[]args)
	{
		queue1 q=new queue1(4);

		for(int i=0;i<5;i++)
		{
			q.add(i);
		}

		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}
}