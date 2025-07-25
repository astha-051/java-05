public  class queuecircular{

	static class queue1{
		static int arr[]; //don't know the size
		static int size;
		static int rear=-1;  //now the queue is empty and don't need to define front because its zero
		static int front=-1;

		queue1(int size)
		{
			arr=new int[size];
			this.size=size;
		}

		public static boolean isEmpty()
		{
			return rear==-1 && front==-1;
		}
		public static boolean isFull()
		{
			return (rear+1)%size == front; //no space for add elements
		}

		public static void add(int data)
		{
			if(isFull())  //queue is full
			{
				System.out.println("queue is full(add)");
				return;
			}
			if(front==-1)
			{
				front=0;  //store elements and front from -1 to 0
			}
			rear=(rear+1)%size;  //when you add elements rear  goes to next index
			arr[rear]=data;  //store on next index
		}

		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("queue is full");
				return -1;
			}

			int result=arr[front];  //removes from start

			if(rear==front) //single element
			{
				rear=front=-1;
			}
			else 
			{
				front=(front+1)%size;  //last index
			}
			
			return result;
		}

		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("empty queue");
				return -1;
			}

			return arr[front];
		}
	}
	public static void main(String[]args)
	{		
		queue1 q=new queue1(8);

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